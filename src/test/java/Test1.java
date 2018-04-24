
import com.ventadecarros.vendedor.config.AppRootConfig;
import com.ventadecarros.vendedor.model.Marca;
import com.ventadecarros.vendedor.service.MarcaService;
import java.util.List;
import org.junit.After;
import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jorda
 */

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Test1 {
    private static AnnotationConfigApplicationContext context = null;
    private static MarcaService marcaservice = null;
    
    @Before
    public void setUp() throws Exception {

        context = new AnnotationConfigApplicationContext(AppRootConfig.class);
        marcaservice = context.getBean(MarcaService.class);
    }
    
    @After
    public void tearDown() throws Exception {
        context.close();
    }
    
    @Test
    public void test1() throws Exception {

        // Add Users
        marcaservice.agregar(new Marca("01","Toyota"));

        // Get Users
        List<Marca> marcas = marcaservice.listarMarca();
        for (Marca marca : marcas) {
            System.out.println("Id = "+marca.getId());
            System.out.println("Código = "+marca.getCod_marca());
            System.out.println("Descripción = "+marca.getDsc_marca());
            System.out.println();

            assertNotNull(marca.getId());
        }


    }
}
