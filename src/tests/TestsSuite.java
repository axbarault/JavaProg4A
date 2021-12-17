package tests;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses({ TestsDossierBancaire.class, TestCompteCourant.class, TestCompteEpargne.class })

public class TestsSuite {}

