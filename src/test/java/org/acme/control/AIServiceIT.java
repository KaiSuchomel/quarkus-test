package org.acme.control;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class AIServiceIT {

    @Inject
    AIService aiService;

    @Test
    public void shouldNotGetTemplateException() {
        String context = """
                         Zu den rüstfähigen Datenobjekten gehören: Handling-Unit, Transport-Handling-Unit, Materialgebinde, Batch und Betriebsmittel (siehe Eingabeparameter setupableType). Hinweis: Die Methode benötigt zur Ausführung den Namen der Organisationseinheit! GET /smartmom-svc/api/views/setups/setupableId/{id}/current
                         
                         	Mit dieser API-Methode können für ein aktuell gerüstetes Datenobjekt sämtliche Rüstinformationen ermittelt werden. Zu den rüstfähigen Datenobjekten gehören derzeit: Handling-Unit, Transport-Handling-Unit, Materialgebinde, Batch und Betriebsmittel (siehe Eingabeparameter setupableType)
                         
                         Hinweis: Die Methode benötigt zur Ausführung die interne ID des gerüsteten Datenobjektes! Eine vollständige Liste der öffentlichen API-Methoden finden Sie im Referenzteil unter API-Methoden (public) - Kurzbeschreibung. Details zum Umgang mit der API-Schnittstelle finden Sie hier: API - Verstehen und Anwenden.
                         
                         © 2025 German Edge CloudZu den rüstfähigen und aktivierbaren Datenobjekten gehören derzeit: Transport-Handling-Unit, Materialgebinde, Batch und Betriebsmittel (siehe Eingabeparameter setupableType). Hinweis: Die Methode benötigt zur Ausführung den Namen der Organisationseinheit! GET /smartmom-svc/api/views/setups/organizationUnitName/{organizationUnitName}
                         
                         	Mit dieser API-Methode können für eine bestimmte Organisationseinheit die Details zu den aktuell gerüsteten Datenobjekten ermittelt werden. Zu den rüstfähigen Datenobjekten gehören: Handling-Unit, Transport-Handling-Unit, Materialgebinde, Batch und Betriebsmittel (siehe Eingabeparameter setupableType). Hinweis: Die Methode benötigt zur Ausführung den Namen der Organisationseinheit! GET /smartmom-svc/api/views/setups/setupableId/{id}/current
                         
                         	Mit dieser API-Methode können für ein aktuell gerüstetes Datenobjekt sämtliche Rüstinformationen ermittelt werden.GET /smartmom-svc/api/views/setups/setupableId/{id}/current
                         
                         	Mit dieser API-Methode können für ein aktuell gerüstetes Datenobjekt sämtliche Rüstinformationen ermittelt werden. Zu den rüstfähigen Datenobjekten gehören derzeit: Handling-Unit, Transport-Handling-Unit, Materialgebinde, Batch und Betriebsmittel (siehe Eingabeparameter setupableType)
                         
                         Hinweis: Die Methode benötigt zur Ausführung die interne ID des gerüsteten Datenobjektes! Eine vollständige Liste der öffentlichen API-Methoden finden Sie im Referenzteil unter API-Methoden (public) - Kurzbeschreibung. Details zum Umgang mit der API-Schnittstelle finden Sie hier: API - Verstehen und Anwenden.
                         
                         © 2025 German Edge CloudGET /smartmom-svc/api/views/setups/setupableId/{id}/current
                         
                         	Mit dieser API-Methode können für ein aktuell gerüstetes Datenobjekt sämtliche Rüstinformationen ermittelt werden. Zu den rüstfähigen Datenobjekten gehören derzeit: Handling-Unit, Transport-Handling-Unit, Materialgebinde, Batch und Betriebsmittel (siehe Eingabeparameter setupableType)
                         
                         Hinweis: Die Methode benötigt zur Ausführung die interne ID des gerüsteten Datenobjektes! Eine vollständige Liste der öffentlichen API-Methoden finden Sie im Referenzteil unter API-Methoden (public) - Kurzbeschreibung. Details zum Umgang mit der API-Schnittstelle finden Sie hier: API - Verstehen und Anwenden.
                         
                         © 2025 German Edge CloudHinweis: Die Methode benötigt zur Ausführung den Namen der Organisationseinheit! GET /smartmom-svc/api/views/setups/setupableId/{id}/current
                         
                         	Mit dieser API-Methode können für ein aktuell gerüstetes Datenobjekt sämtliche Rüstinformationen ermittelt werden. Zu den rüstfähigen Datenobjekten gehören derzeit: Handling-Unit, Transport-Handling-Unit, Materialgebinde, Batch und Betriebsmittel (siehe Eingabeparameter setupableType)
                         
                         Hinweis: Die Methode benötigt zur Ausführung die interne ID des gerüsteten Datenobjektes!
                         
                         
                         
                         
                         © 2025 German Edge CloudHinweis: Die Methode benötigt zur Ausführung den Namen der Organisationseinheit! GET /smartmom-svc/api/views/setups/organizationUnitName/{organizationUnitName}
                         
                         	Mit dieser API-Methode können für eine bestimmte Organisationseinheit die Details zu den aktuell gerüsteten Datenobjekten ermittelt werden. Zu den rüstfähigen Datenobjekten gehören: Handling-Unit, Transport-Handling-Unit, Materialgebinde, Batch und Betriebsmittel (siehe Eingabeparameter setupableType). Hinweis: Die Methode benötigt zur Ausführung den Namen der Organisationseinheit! GET /smartmom-svc/api/views/setups/setupableId/{id}/current
                         
                         	Mit dieser API-Methode können für ein aktuell gerüstetes Datenobjekt sämtliche Rüstinformationen ermittelt werden. Zu den rüstfähigen Datenobjekten gehören derzeit: Handling-Unit, Transport-Handling-Unit, Materialgebinde, Batch und Betriebsmittel (siehe Eingabeparameter setupableType)
                         
                         Hinweis: Die Methode benötigt zur Ausführung die interne ID des gerüsteten Datenobjektes!Hinweis: Die Methode benötigt zur Ausführung den Namen der Organisationseinheit! GET /smartmom-svc/api/views/setups/organizationUnitName/{organizationUnitName}
                         
                         	Mit dieser API-Methode können für eine bestimmte Organisationseinheit die Details zu den aktuell gerüsteten Datenobjekten ermittelt werden. Zu den rüstfähigen Datenobjekten gehören: Handling-Unit, Transport-Handling-Unit, Materialgebinde, Batch und Betriebsmittel (siehe Eingabeparameter setupableType). Hinweis: Die Methode benötigt zur Ausführung den Namen der Organisationseinheit! GET /smartmom-svc/api/views/setups/setupableId/{id}/current
                         
                         	Mit dieser API-Methode können für ein aktuell gerüstetes Datenobjekt sämtliche Rüstinformationen ermittelt werden. Zu den rüstfähigen Datenobjekten gehören derzeit: Handling-Unit, Transport-Handling-Unit, Materialgebinde, Batch und Betriebsmittel (siehe Eingabeparameter setupableType)
                         
                         Hinweis: Die Methode benötigt zur Ausführung die interne ID des gerüsteten Datenobjektes!Hinweis: Die Methode benötigt zur Ausführung den Namen der Organisationseinheit! GET /smartmom-svc/api/views/setups/setupableId/{id}/current
                         
                         	Mit dieser API-Methode können für ein aktuell gerüstetes Datenobjekt sämtliche Rüstinformationen ermittelt werden. Zu den rüstfähigen Datenobjekten gehören derzeit: Handling-Unit, Transport-Handling-Unit, Materialgebinde, Batch und Betriebsmittel (siehe Eingabeparameter setupableType)
                         
                         Hinweis: Die Methode benötigt zur Ausführung die interne ID des gerüsteten Datenobjektes! Eine vollständige Liste der öffentlichen API-Methoden finden Sie im Referenzteil unter API-Methoden (public) - Kurzbeschreibung. Details zum Umgang mit der API-Schnittstelle finden Sie hier: API - Verstehen und Anwenden.
                         
                         
                         © 2025 German Edge CloudHinweis: Die Methode benötigt zur Ausführung den Namen der Organisationseinheit! GET /smartmom-svc/api/views/setups/organizationUnitName/{organizationUnitName}
                         
                         	Mit dieser API-Methode können für eine bestimmte Organisationseinheit die Details zu den aktuell gerüsteten Datenobjekten ermittelt werden. Zu den rüstfähigen Datenobjekten gehören: Handling-Unit, Transport-Handling-Unit, Materialgebinde, Batch und Betriebsmittel (siehe Eingabeparameter setupableType). Hinweis: Die Methode benötigt zur Ausführung den Namen der Organisationseinheit! GET /smartmom-svc/api/views/setups/setupableId/{id}/current
                         
                         	Mit dieser API-Methode können für ein aktuell gerüstetes Datenobjekt sämtliche Rüstinformationen ermittelt werden.Objektstatus
                         
                         Viele, zumindest aus Fertigungssicht relevanten Datenobjekte sind "objektstatusfähig" und können vom System entsprechend verwaltet werden. Nur für diese Datenobjekte können dem Anwender Freigabe- und Archivierungsfunktionen angeboten werden. Es gibt auch einige (unkritische) Datenobjekte, bei denen aktuell keine Notwenigkeit auf Freigabe- und Archivierungsfunktionen bestehen. Hier ein paar Arten von objektstatusfähigen und nicht-objektstatusfähigen Datenobjekte:
                         
                         	objektstatusfähig: z.B. Artikcklisten, Arbeitspläne, Aufträge, Qualifikationen
                         	nicht-objektstatusfähig: z.B. Adresstypen, Lagerplätze, Maschinenmeldungsklassen, Seriennummern (Sonderfall)
                         
                         
                         Eine vollständige Liste der objektstatusfähigen Datenobjekte – im API-Umfeld mit releasables deklariert – können Sie über eine interne API-Methode separat für jeden Microservice abfragen.Mit der API-Methode PUT /smartmom-svc/api/resources/setups/containers/containerName/{containerName}/organizationUnitName/{organizationUnitName kann auch eine positionsunabhängige Rüstung erfolgen. Hinweis: Die Methode benötigt zur Ausführung die gewünschte Rüstposition sowie die Namen des Datenobjektes und der Organisationseinheit! API-Gruppe: smom setups views (public)
                         
                         
                         	GET /smartmom-svc/api/views/setups/organizationUnitName/{organizationUnitName}
                         
                         	Mit dieser API-Methode können für eine bestimmte Organisationseinheit die Details zu den aktuell gerüsteten Datenobjekten ermittelt werden. Zu den rüstfähigen Datenobjekten gehören: Handling-Unit, Transport-Handling-Unit, Materialgebinde, Batch und Betriebsmittel (siehe Eingabeparameter setupableType). Hinweis: Die Methode benötigt zur Ausführung den Namen der Organisationseinheit!
                         
                         """;
        String question = "welche datenobjekte sind rüstfähig";
        String fullPrompt = String.format("""
                Context:
                %s

                Question: %s
                """, context, question);
        String result = aiService.chat(0, fullPrompt);
        assertThat(result, is(notNullValue()));
    }
    
    @Test
    public void shouldGetAResult() {
        String context = """
                         folgenden datenobjekt sind rüstfähig A B C
                         """;
        String question = "welche datenobjekte sind rüstfähig";
        String fullPrompt = String.format("""
                Context:
                %s

                Question: %s
                """, context, question);
        String result = aiService.chat(0, fullPrompt);
        assertThat(result, is(notNullValue()));
    }

}
