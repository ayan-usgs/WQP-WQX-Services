package gov.usgs.wma.wqp.mapping.xml;

import static gov.usgs.wma.wqp.mapping.BaseColumn.KEY_ORGANIZATION;
import static gov.usgs.wma.wqp.mapping.BaseColumn.ORGANIZATION;
import static gov.usgs.wma.wqp.mapping.BaseColumn.ORGANIZATION_NAME;
import static gov.usgs.wma.wqp.mapping.ProjectColumn.*;
import static gov.usgs.wma.wqp.mapping.ProjectMonitoringLocationWeightingColumn.*;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import gov.usgs.wma.wqp.mapping.ColumnProfile;

@Component
public class ProjectMonitoringLocationWeightingWqx extends BaseWqx implements IXmlMapping {
    public static final Map<String, String> HARD_BREAK = new LinkedHashMap<>();
	public static final Map<String, List<String>> COLUMN_POSITION = new LinkedHashMap<>();
	public static final Map<String, List<ColumnProfile>> GROUPING = new LinkedHashMap<>();

    //Hard Break
	static {
		HARD_BREAK.putAll(ProjectWqx.HARD_BREAK);
		HARD_BREAK.put(KEY_PRJMLW_ID, WQX_PROJECT);
	}
    
    //Column Position
	static {
		COLUMN_POSITION.put(KEY_ORGANIZATION, 
				new LinkedList<String>(Arrays.asList(
						WQX_ORGANIZATION,
						WQX_ORGANIZATION_DESCRIPTION,
						WQX_ORGANIZATION_IDENTIFIER)));
		COLUMN_POSITION.put(KEY_ORGANIZATION_NAME,
				new LinkedList<String>(Arrays.asList(
						WQX_ORGANIZATION,
						WQX_ORGANIZATION_DESCRIPTION,
						WQX_ORGANIZATION_FORMAL_NAME)));
		COLUMN_POSITION.put(KEY_PROJECT_IDENTIFIER,
				new LinkedList<String>(Arrays.asList(
						WQX_ORGANIZATION,
						WQX_PROJECT,
						WQX_PROJECT_IDENTIFIER)));
		COLUMN_POSITION.put(KEY_SITE_ID,
				new LinkedList<String>(Arrays.asList(
						WQX_ORGANIZATION,
						WQX_PROJECT,
						WQX_PROJECT_MONITORING_LOCATION_WEIGHTING,
						WQX_MONITORING_LOCATION_IDENTIFIER)));
		COLUMN_POSITION.put(KEY_PRJMLW_VALUE,
				new LinkedList<String>(Arrays.asList(
						WQX_ORGANIZATION,
						WQX_PROJECT,
						WQX_PROJECT_MONITORING_LOCATION_WEIGHTING,
						WQX_PROJECT_MONITORING_LOCATION_WEIGHTING_FACTOR_MEASURE,
						WQX_MEASURE_VALUE)));
		COLUMN_POSITION.put(KEY_PRJMLW_UNIT,
				new LinkedList<String>(Arrays.asList(
						WQX_ORGANIZATION,
						WQX_PROJECT,
						WQX_PROJECT_MONITORING_LOCATION_WEIGHTING,
						WQX_PROJECT_MONITORING_LOCATION_WEIGHTING_FACTOR_MEASURE,
						WQX_MEASURE_UNIT)));
		COLUMN_POSITION.put(KEY_PRJMLW_STATISTICAL_STRATUM,
				new LinkedList<String>(Arrays.asList(
						WQX_ORGANIZATION,
						WQX_PROJECT,
						WQX_PROJECT_MONITORING_LOCATION_WEIGHTING,
						WQX_STATISTICAL_STRATUM_TEXT)));
		COLUMN_POSITION.put(KEY_PRJMLW_LOCATION_CATEGORY,
				new LinkedList<String>(Arrays.asList(
						WQX_ORGANIZATION,
						WQX_PROJECT,
						WQX_PROJECT_MONITORING_LOCATION_WEIGHTING,
						WQX_LOCATION_CATEGORY_NAME)));
		COLUMN_POSITION.put(KEY_PRJMLW_LOCATION_STATUS,
				new LinkedList<String>(Arrays.asList(
						WQX_ORGANIZATION,
						WQX_PROJECT,
						WQX_PROJECT_MONITORING_LOCATION_WEIGHTING,
						WQX_LOCATION_STATUS_NAME)));
		COLUMN_POSITION.put(KEY_PRJMLW_REFERENCE_LOCATION_TYPE_CODE,
				new LinkedList<String>(Arrays.asList(
						WQX_ORGANIZATION,
						WQX_PROJECT,
						WQX_PROJECT_MONITORING_LOCATION_WEIGHTING,
						WQX_REFERENCE_LOCATION_TYPE_CODE)));
		COLUMN_POSITION.put(KEY_PRJMLW_REFERENCE_LOCATION_START_DATE,
				new LinkedList<String>(Arrays.asList(
						WQX_ORGANIZATION,
						WQX_PROJECT,
						WQX_PROJECT_MONITORING_LOCATION_WEIGHTING,
						WQX_REFERENCE_LOCATION_START_DATE)));
		COLUMN_POSITION.put(KEY_PRJMLW_REFERENCE_LOCATION_END_DATE,
				new LinkedList<String>(Arrays.asList(
						WQX_ORGANIZATION,
						WQX_PROJECT,
						WQX_PROJECT_MONITORING_LOCATION_WEIGHTING,
						WQX_REFERENCE_LOCATION_END_DATE)));
		COLUMN_POSITION.put(KEY_REFERENCE_LOCATION_CITATION_TITLE,
				new LinkedList<String>(Arrays.asList(
						WQX_ORGANIZATION,
						WQX_PROJECT,
						WQX_PROJECT_MONITORING_LOCATION_WEIGHTING,
						WQX_REFERENCE_LOCATION_CITATION,
						WQX_RESOURCE_TITLE)));
		COLUMN_POSITION.put(KEY_REFERENCE_LOCATION_CITATION_CREATOR,
				new LinkedList<String>(Arrays.asList(
						WQX_ORGANIZATION,
						WQX_PROJECT,
						WQX_PROJECT_MONITORING_LOCATION_WEIGHTING,
						WQX_REFERENCE_LOCATION_CITATION,
						WQX_RESOURCE_CREATOR)));
		COLUMN_POSITION.put(KEY_REFERENCE_LOCATION_CITATION_SUBJECT,
				new LinkedList<String>(Arrays.asList(
						WQX_ORGANIZATION,
						WQX_PROJECT,
						WQX_PROJECT_MONITORING_LOCATION_WEIGHTING,
						WQX_REFERENCE_LOCATION_CITATION,
						WQX_RESOURCE_SUBJECT)));
		COLUMN_POSITION.put(KEY_REFERENCE_LOCATION_CITATION_PUBLISHER,
				new LinkedList<String>(Arrays.asList(
						WQX_ORGANIZATION,
						WQX_PROJECT,
						WQX_PROJECT_MONITORING_LOCATION_WEIGHTING,
						WQX_REFERENCE_LOCATION_CITATION,
						WQX_RESOURCE_PUBLISHER)));
		COLUMN_POSITION.put(KEY_REFERENCE_LOCATION_CITATION_DATE,
				new LinkedList<String>(Arrays.asList(
						WQX_ORGANIZATION,
						WQX_PROJECT,
						WQX_PROJECT_MONITORING_LOCATION_WEIGHTING,
						WQX_REFERENCE_LOCATION_CITATION,
						WQX_RESOURCE_DATE)));
		COLUMN_POSITION.put(KEY_REFERENCE_LOCATION_CITATION_IDENTIFIER,
				new LinkedList<String>(Arrays.asList(
						WQX_ORGANIZATION,
						WQX_PROJECT,
						WQX_PROJECT_MONITORING_LOCATION_WEIGHTING,
						WQX_REFERENCE_LOCATION_CITATION,
						WQX_RESOURCE_ID)));
		COLUMN_POSITION.put(KEY_PRJMLW_COMMENT,
				new LinkedList<String>(Arrays.asList(
						WQX_ORGANIZATION,
						WQX_PROJECT,
						WQX_PROJECT_MONITORING_LOCATION_WEIGHTING,
						WQX_PROJECT_MONITORING_LOCATION_WEIGHTING_COMMENT_TEXT)));
	}

    //Grouping
	static {
		GROUPING.put(KEY_ORGANIZATION,
				new LinkedList<ColumnProfile>(Arrays.asList(
					ORGANIZATION, 
					ORGANIZATION_NAME)));

		GROUPING.put(KEY_PROJECT_ID,
				new LinkedList<ColumnProfile>(Arrays.asList(
					PROJECT_IDENTIFIER)));
		
		GROUPING.put(KEY_PRJMLW_ID,
				new LinkedList<ColumnProfile>(Arrays.asList(
						SITE_ID,
						PRJMLW_VALUE,
						PRJMLW_UNIT,
						PRJMLW_STATISTICAL_STRATUM,
						PRJMLW_LOCATION_CATEGORY,
						PRJMLW_LOCATION_STATUS,
						PRJMLW_REFERENCE_LOCATION_TYPE_CODE,
						PRJMLW_REFERENCE_LOCATION_START_DATE,
						PRJMLW_REFERENCE_LOCATION_END_DATE,
						REFERENCE_LOCATION_CITATION_TITLE, 
						REFERENCE_LOCATION_CITATION_CREATOR,
						REFERENCE_LOCATION_CITATION_SUBJECT,
						REFERENCE_LOCATION_CITATION_PUBLISHER,
						REFERENCE_LOCATION_CITATION_DATE,
						REFERENCE_LOCATION_CITATION_IDENTIFIER,
						PRJMLW_COMMENT)));
	}

	public Map<String, List<String>> getStructure() {
		return COLUMN_POSITION;
	}

	public Map<String, String> getHardBreak() {
		return HARD_BREAK;
	}

	public Map<String, List<ColumnProfile>> getGrouping() {
		return GROUPING;
	}

	public String getEntryNodeName() {
		return WQX_PROVIDER;
	}
}