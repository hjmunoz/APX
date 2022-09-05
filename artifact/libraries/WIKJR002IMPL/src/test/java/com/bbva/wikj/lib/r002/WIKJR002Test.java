package com.bbva.wikj.lib.r002;

import com.bbva.elara.configuration.manager.application.ApplicationConfigurationService;
import com.bbva.elara.domain.transaction.Context;
import com.bbva.elara.domain.transaction.ThreadContext;
import javax.annotation.Resource;

import com.bbva.wikj.dto.ejercicioapxv.DataDTO;
import com.bbva.wikj.dto.ejercicioapxv.Producto;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.springframework.aop.framework.Advised;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath:/META-INF/spring/WIKJR002-app.xml",
		"classpath:/META-INF/spring/WIKJR002-app-test.xml",
		"classpath:/META-INF/spring/WIKJR002-arc.xml",
		"classpath:/META-INF/spring/WIKJR002-arc-test.xml" })
public class WIKJR002Test {

	@Spy
	private Context context;

	@Resource(name = "wikjR002")
	private WIKJR002 wikjR002;

	@Resource(name = "applicationConfigurationService")
	private ApplicationConfigurationService applicationConfigurationService;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		context = new Context();
		ThreadContext.set(context);
		getObjectIntrospection();
	}
	
	private Object getObjectIntrospection() throws Exception{
		Object result = this.wikjR002;
		if(this.wikjR002 instanceof Advised){
			Advised advised = (Advised) this.wikjR002;
			result = advised.getTargetSource().getTarget();
		}
		return result;
	}
	
	@Test
	public void executeTest(){
		wikjR002.execute(respuestaDatos());
		Assert.assertEquals(0, context.getAdviceList().size());
	}

	public DataDTO respuestaDatos() {

		Producto producto = new Producto();
		producto.setNombre("Portatil");
		producto.setMarca("HP");
		producto.setDescripcion("pc para trabajos pesados");
		producto.setPrecio(1000000);
		producto.setCantidad(2);

		List<Producto> productoList = new ArrayList<>();
		productoList.add(producto);

		DataDTO dataDTO = new DataDTO();
		dataDTO.setCompra(productoList);

		return dataDTO;
	}
	
}
