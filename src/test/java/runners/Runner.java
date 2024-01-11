package runners;


/*
    Runner class'i bos bir class'tir.
    Runner class'inin bize sagladigi islev sahip oldugu iki notasyon ile iliskilidir.

    dryRun= true yaptigimizda var olan adimlari CALISTIRMADAN
    sadece eksik adimlari bulur ve onlarla ilgili stepdefinition'lari bize verir.

    Eger eksik adim yoksa, bu durumu raporlamak icin Test PASSED isaretlenir.

    features = "src/test/resources",
    glue = "stepdefinitions",

    Bu iki klasor birbiriyle ilisiklendirildigi icin bu klasorlerin altindaki tum file'lar
    ve class'lar ilisiklidir. Cucumber'da file ve class'lari 1-1 eslestirmek yerine tumunu eslestirir.

    Eger siz spesifik olarak 1 fature'i, belirledigimiz 1 stepdefinition class'i
 */

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin ={"html:target/cucumber-reports.html",
        "json:target/json-reports/cucumber.json",
        "junit:target/xml-report/cucumber.xml"},
        features = "src/test/resources",
        glue = "stepdefinitions",
        tags = " ",
        dryRun = false
)
public class Runner {
}
