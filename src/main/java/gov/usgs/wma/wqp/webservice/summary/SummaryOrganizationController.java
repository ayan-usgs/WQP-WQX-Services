package gov.usgs.wma.wqp.webservice.summary;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Validator;

import org.springframework.http.MediaType;
import org.springframework.web.accept.ContentNegotiationStrategy;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import gov.usgs.wma.wqp.dao.intfc.ICountDao;
import gov.usgs.wma.wqp.dao.intfc.IStreamingDao;
import gov.usgs.wma.wqp.mapping.Profile;
import gov.usgs.wma.wqp.mapping.xml.IXmlMapping;
import gov.usgs.wma.wqp.openapi.ConfigOpenApi;
import gov.usgs.wma.wqp.openapi.annotation.FormUrlPostOperation;
import gov.usgs.wma.wqp.openapi.annotation.GetOperation;
import gov.usgs.wma.wqp.openapi.annotation.HeadOperation;
import gov.usgs.wma.wqp.openapi.annotation.PostCountOperation;
import gov.usgs.wma.wqp.openapi.annotation.PostOperation;
import gov.usgs.wma.wqp.openapi.annotation.post.SummaryParametersPostOrganization;
import gov.usgs.wma.wqp.openapi.annotation.query.MimeTypeJson;
import gov.usgs.wma.wqp.openapi.annotation.query.SummaryParameterListOrganization;
import gov.usgs.wma.wqp.openapi.annotation.query.Zip;
import gov.usgs.wma.wqp.openapi.model.OrganizationCountJson;
import gov.usgs.wma.wqp.parameter.FilterParameters;
import gov.usgs.wma.wqp.service.ConfigurationService;
import gov.usgs.wma.wqp.service.ILogService;
import gov.usgs.wma.wqp.util.HttpConstants;
import gov.usgs.wma.wqp.webservice.BaseController;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name=ConfigOpenApi.SUMMARY_ORGANIZATION_TAG_NAME, description=ConfigOpenApi.TAG_DESCRIPTION)
@RestController
@RequestMapping(value=HttpConstants.SUMMARY_ORGANIZATION_ENDPOINT,
	produces={HttpConstants.MIME_TYPE_JSON})
public class SummaryOrganizationController extends BaseController {

	public SummaryOrganizationController(IStreamingDao inStreamingDao, ICountDao inCountDao, ILogService inLogService,
			ContentNegotiationStrategy inContentStrategy, Validator inValidator, ConfigurationService configurationService) {
	super(inStreamingDao, inCountDao, inLogService, inContentStrategy, inValidator, configurationService);
	}

	@Operation(description=HeadOperation.DEFAULT_DESCRIPTION)
	@SummaryParameterListOrganization
	@RequestMapping(method=RequestMethod.HEAD)
	public void summaryOrganizationRequest(HttpServletRequest request,
			HttpServletResponse response,
			@Parameter(hidden=true) FilterParameters filter
			) {
		doHeadRequest(request, response, filter);
	}

	@Operation(description=GetOperation.DEFAULT_DESCRIPTION)
	@SummaryParameterListOrganization
	@RequestMapping(method=RequestMethod.GET)
	public void summaryOrganizationGetRequest(HttpServletRequest request,
			HttpServletResponse response,
			@Parameter(hidden=true) FilterParameters filter
			) {
		doDataRequest(request, response, filter);
	}

	@PostOperation
	@MimeTypeJson
	@Zip
	@SummaryParametersPostOrganization
	@PostMapping(consumes=MediaType.APPLICATION_JSON_VALUE)
	public void summaryOrganizationJsonPostRequest(
			HttpServletRequest request,
			HttpServletResponse response,
			@Parameter(hidden=true) @RequestParam(value="mimeType", required=false) String mimeType,
			@Parameter(hidden=true) @RequestParam(value="zip", required=false) String zip,
			@Parameter(hidden=true) @RequestBody FilterParameters filter
			) {
		doDataRequest(request, response, filter, mimeType, zip);
	}

	@FormUrlPostOperation
	public void summaryOrganizationFormUrlencodedPostRequest(
			HttpServletRequest request,
			HttpServletResponse response,
			@Parameter(hidden=true) FilterParameters filter
			) {
		doDataRequest(request, response, filter);
	}

	@Operation(description=PostCountOperation.DEFAULT_DESCRIPTION)
	@SummaryParametersPostOrganization
	@MimeTypeJson
	@Zip
	@ApiResponse(
			responseCode="200",
			description="OK",
			content=@Content(schema=@Schema(implementation=OrganizationCountJson.class)))
	@PostMapping(value="count", produces=MediaType.APPLICATION_JSON_VALUE)
	public Map<String, String> summaryOrganizationPostCountRequest(
			HttpServletRequest request,
			HttpServletResponse response,
			@Parameter(hidden=true) @RequestParam(value="mimeType", required=false) String mimeType,
			@Parameter(hidden=true) @RequestParam(value="zip", required=false) String zip,
			@Parameter(hidden=true) @RequestBody FilterParameters filter
			) {
		return doPostCountRequest(request, response, filter, mimeType, zip);
	}

	@Override
	protected String addCountHeaders(HttpServletResponse response, List<Map<String, Object>> counts) {
		addOrganizationHeaders(response, counts);
	return HttpConstants.HEADER_TOTAL_ORGANIZATION_COUNT;
	}

	@Override
	protected Profile determineProfile(FilterParameters filter) {
		return determineProfile(Profile.SUMMARY_ORGANIZATION, filter);
	}

	@Override
	protected Map<String, String> getMapping(Profile profile) {
		return new HashMap<>();
	}

	@Override
	protected IXmlMapping getXmlMapping() {
		return null;
	}

	@Override
	protected IXmlMapping getKmlMapping() {
		return null;
	}

	@Override
	protected void addCustomRequestParams() {
		getFilter().setSiteUrlBase(configurationService.getMyUrlBase());
	}
}
