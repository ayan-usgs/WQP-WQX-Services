package gov.usgs.cida.wqp.webservice;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import gov.usgs.cida.wqp.swagger.SwaggerConfig;
import gov.usgs.cida.wqp.swagger.annotation.NoQueryParametersList;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags={SwaggerConfig.VERSION_TAG_NAME})
@Controller
public class VersionController {

	@ApiOperation(value="Return the web service version information.")
	@NoQueryParametersList
	@RequestMapping(value="version", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public String getVersion() {
		return "redirect:/actuator/info";
	}

}