package webApps;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/alumno")
public class AlumnoController {
	
	@RequestMapping("/mostrarFormulario")
	public String mostrarFormulario(Model modelo) {
		
		Alumno alumnoX = new Alumno();
		
		modelo.addAttribute("estudianteX", alumnoX);
		
		return "formularioRegistroAlumno";
	}

}














/*

addAttribute(String attributeName, Object attributeValue)

<> alumnoX 
Representa a un par�metro de tipo objeto, ..as� que es un objeto ...

<> estudianteX
Representa al nombre que representar� al objeto

*/


