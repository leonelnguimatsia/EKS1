package de.thkoeln.eks.lehre.fachlogik.fall78;

import de.thkoeln.eks.lehre.datenhaltung.api.Modul;
import de.thkoeln.eks.lehre.datenhaltung.api.Pruefungssystem;
import de.thkoeln.eks.lehre.datenhaltung.api.VeranstaltungsListe;
import org.junit.Before;
import org.junit.Test;
import org.mockito.*;

import static org.mockito.Mockito.*;

public class TestFall78Impl {

    @Mock
    VeranstaltungsListe mockedVeranstaltungsListe;

    @Mock
    Pruefungssystem mockedPruefungssystem;

    @InjectMocks
    private Fall78Impl sut = new Fall78Impl();

    @Captor
    ArgumentCaptor<Modul> modulCaptor;
    @Before
    public void setUpTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testNeuesModulPruefungErstellen() {
        // Init
        String modultitel = "Modultitle";
        String dozent = "Dozent";
        int teilnehmer = 25;
        Modul modul = new Modul("Modul"+modultitel, dozent);
        modul.setId(0);

        // Mockito stubbing
        when(mockedVeranstaltungsListe.existiertModul(modultitel)).thenReturn(false);
        when(mockedVeranstaltungsListe.createModul(modul)).thenReturn(1);
        doNothing().when(mockedVeranstaltungsListe).setBelegbar(modul.getId(), false);
        doNothing().when(mockedPruefungssystem).setPruefbar(modul.getId(), false);
        when(mockedVeranstaltungsListe.get(anyInt())).thenReturn(modul);
        when(mockedVeranstaltungsListe.existiertModul(modul.getTitel())).thenReturn(true);
        doNothing().when(mockedVeranstaltungsListe).setBelegbar(modul.getId(), true);
        when(mockedVeranstaltungsListe.istBelegbar(modul.getId())).thenReturn(true);
        doNothing().when(mockedPruefungssystem).pruefungErstellen(modul.getId(), teilnehmer);
        when(mockedPruefungssystem.anzahlTeilnehmer(modul.getId())).thenReturn(teilnehmer);
        doNothing().when(mockedPruefungssystem).setPruefbar(modul.getId(), true);
        when(mockedPruefungssystem.istPruefbar(modul.getId())).thenReturn(true);

        // SUT Calling
        sut.neuesModulPruefungErstellen(modultitel, dozent, teilnehmer);

        // Set up order
        InOrder inOrder = inOrder(mockedVeranstaltungsListe, mockedPruefungssystem);

        // Mockito verification
        inOrder.verify(mockedVeranstaltungsListe).existiertModul(modultitel);
            // Verify with modul ArgumentCaptor
        inOrder.verify(mockedVeranstaltungsListe, times(1)).createModul(modulCaptor.capture());
        Modul captorModul = modulCaptor.getValue();
        captorModul.setId(0);
        inOrder.verify(mockedVeranstaltungsListe).setBelegbar(captorModul.getId(), false);
        inOrder.verify(mockedPruefungssystem).setPruefbar(captorModul.getId(), false);
        inOrder.verify(mockedVeranstaltungsListe).get(captorModul.getId());
        inOrder.verify(mockedVeranstaltungsListe).existiertModul(captorModul.getTitel());
        inOrder.verify(mockedVeranstaltungsListe).setBelegbar(captorModul.getId(), true);
        inOrder.verify(mockedVeranstaltungsListe, atLeastOnce()).istBelegbar(captorModul.getId());
        inOrder.verify(mockedPruefungssystem, times(1)).pruefungErstellen(captorModul.getId(), teilnehmer);
        inOrder.verify(mockedPruefungssystem).anzahlTeilnehmer(captorModul.getId());
        inOrder.verify(mockedPruefungssystem).setPruefbar(captorModul.getId(), true);
        inOrder.verify(mockedPruefungssystem, atLeastOnce()).istPruefbar(captorModul.getId());
    }
}
