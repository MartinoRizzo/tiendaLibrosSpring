package gm.tiendaLibros;


import gm.tiendaLibros.vista.Vista;
import java.awt.EventQueue;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TiendaLibrosApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext contextoSpring = 
                        (ConfigurableApplicationContext) new SpringApplicationBuilder(TiendaLibrosApplication.class).headless(false).web(WebApplicationType.NONE).run(args);
	//Ejecutamos elcodigo para cargar el formulario
        EventQueue.invokeLater(()->{
            //Obtenemos el objeto form a traves de Spring
            Vista libroForm = contextoSpring.getBean(Vista.class);
            libroForm.setVisible(true);
            
        });
        
        }

}
