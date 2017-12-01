package gov.usgs.cida.wqp.mapping.xml;

import static gov.usgs.cida.wqp.mapping.BaseColumn.*;
import static gov.usgs.cida.wqp.mapping.ActivityColumn.*;
import static gov.usgs.cida.wqp.mapping.ActivityMetricColumn.*;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import gov.usgs.cida.wqp.mapping.ColumnProfile;

@Component
public class ActivityWqx extends BaseWqx implements IXmlMapping {

	public static final Map<String, String> HARD_BREAK = new LinkedHashMap<>();
	public static final Map<String, List<String>> COLUMN_POSITION = new LinkedHashMap<>();
	public static final Map<String, List<ColumnProfile>> GROUPING = new LinkedHashMap<>();

	static {
		HARD_BREAK.put(KEY_ORGANIZATION, ROOT_NODE);
		HARD_BREAK.put(KEY_ACTIVITY, WQX_ORGANIZATION);
	}

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
		COLUMN_POSITION.put(KEY_ACTIVITY,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_ACT_DESCRIPTION,
						WQX_ACT_ID)));
		COLUMN_POSITION.put(KEY_ACTIVITY_TYPE_CODE,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_ACT_DESCRIPTION,
						WQX_ACT_TYPE)));
		COLUMN_POSITION.put(KEY_SAMPLE_MEDIA,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_ACT_DESCRIPTION,
						WQX_ACT_MEDIA)));
		COLUMN_POSITION.put(KEY_ACTIVITY_MEDIA_SUBDIV_NAME,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_ACT_DESCRIPTION,
						WQX_ACT_MEDIA_SUB)));
		COLUMN_POSITION.put(KEY_EVENT_DATE,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_ACT_DESCRIPTION,
						WQX_ACT_START_DATE)));
		COLUMN_POSITION.put(KEY_ACTIVITY_START_TIME,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_ACT_DESCRIPTION,
						WQX_ACT_START_TIME,
						WQX_TIME)));
		COLUMN_POSITION.put(KEY_ACT_START_TIME_ZONE,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_ACT_DESCRIPTION,
						WQX_ACT_START_TIME,
						WQX_TIME_ZONE)));
		COLUMN_POSITION.put(KEY_ACTIVITY_STOP_DATE,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_ACT_DESCRIPTION,
						WQX_ACT_END_DATE)));
		COLUMN_POSITION.put(KEY_ACTIVITY_STOP_TIME,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_ACT_DESCRIPTION,
						WQX_ACT_END_TIME,
						WQX_TIME)));
		COLUMN_POSITION.put(KEY_ACT_STOP_TIME_ZONE,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_ACT_DESCRIPTION,
						WQX_ACT_END_TIME,
						WQX_TIME_ZONE)));
		COLUMN_POSITION.put(KEY_ACTIVITY_RELATIVE_DEPTH,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_ACT_DESCRIPTION,
						WQX_ACT_RELATIVE_DEPTH)));
		COLUMN_POSITION.put(KEY_ACTIVITY_DEPTH,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_ACT_DESCRIPTION,
						WQX_ACT_DEPTH,
						WQX_MEASURE_VALUE)));
		COLUMN_POSITION.put(KEY_ACTIVITY_DEPTH_UNIT,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_ACT_DESCRIPTION,
						WQX_ACT_DEPTH,
						WQX_MEASURE_UNIT)));
		COLUMN_POSITION.put(KEY_ACTIVITY_DEPTH_REF_POINT,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_ACT_DESCRIPTION,
						WQX_ACT_DEPTH_REFERENCE)));
		COLUMN_POSITION.put(KEY_ACTIVITY_UPPER_DEPTH,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_ACT_DESCRIPTION,
						WQX_ACT_TOP_DEPTH,
						WQX_MEASURE_VALUE)));
		COLUMN_POSITION.put(KEY_ACTIVITY_UPPER_DEPTH_UNIT,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_ACT_DESCRIPTION,
						WQX_ACT_TOP_DEPTH,
						WQX_MEASURE_UNIT)));
		COLUMN_POSITION.put(KEY_ACTIVITY_LOWER_DEPTH,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_ACT_DESCRIPTION,
						WQX_ACT_BOTTOM_DEPTH,
						WQX_MEASURE_VALUE)));
		COLUMN_POSITION.put(KEY_ACTIVITY_LOWER_DEPTH_UNIT,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_ACT_DESCRIPTION,
						WQX_ACT_BOTTOM_DEPTH,
						WQX_MEASURE_UNIT)));
		COLUMN_POSITION.put(KEY_PROJECT_ID,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_ACT_DESCRIPTION,
						WQX_PROJECT_IDENTIFIER)));
		COLUMN_POSITION.put(KEY_ACTIVITY_CONDUCTING_ORG,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_ACT_DESCRIPTION,
						WQX_ACT_CONDUCTION_ORG)));
		COLUMN_POSITION.put(KEY_SITE_ID,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_ACT_DESCRIPTION,
						WQX_MONITORING_LOCATION_IDENTIFIER)));
		COLUMN_POSITION.put(KEY_ACTIVITY_COMMENT,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_ACT_DESCRIPTION,
						WQX_ACT_COMMENT)));
		COLUMN_POSITION.put(KEY_SAMPLE_AQFR_NAME,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_ACT_DESCRIPTION,
						WQX_SAMPLE_AQUIFER)));
		COLUMN_POSITION.put(KEY_HYDROLOGIC_CONDITION_NAME,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_ACT_DESCRIPTION,
						WQX_HYDROLOGIC_CONDITION)));
		COLUMN_POSITION.put(KEY_HYDROLOGIC_EVENT_NAME,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_ACT_DESCRIPTION,
						WQX_HYDROLOGIC_EVENT)));
		COLUMN_POSITION.put(KEY_ACTIVITY_LATITUDE,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_ACT_LOCATION,
						WQX_LATITUDE_MEASURE)));
		COLUMN_POSITION.put(KEY_ACTIVITY_LONGITUDE,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_ACT_LOCATION,
						WQX_LONGITUDE_MEASURE)));
		COLUMN_POSITION.put(KEY_ACTIVITY_SOURCE_MAP_SCALE,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_ACT_LOCATION,
						WQX_SOURCE_MAP_SCALE)));
		COLUMN_POSITION.put(KEY_ACT_HORIZONTAL_ACCURACY,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_ACT_LOCATION,
						WQX_HORIZONTAL_ACCY,
						WQX_MEASURE_VALUE)));
		COLUMN_POSITION.put(KEY_ACT_HORIZONTAL_ACCURACY_UNIT,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_ACT_LOCATION,
						WQX_HORIZONTAL_ACCY,
						WQX_MEASURE_UNIT)));
		COLUMN_POSITION.put(KEY_ACT_HORIZONTAL_COLLECT_METHOD,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_ACT_LOCATION,
						WQX_HORIZONTAL_COLLECTION_METHOD)));
		COLUMN_POSITION.put(KEY_ACT_HORIZONTAL_DATUM_NAME,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_ACT_LOCATION,
						WQX_HORIZONTAL_DATUM)));
		COLUMN_POSITION.put(KEY_ASSEMBLAGE_SAMPLED_NAME,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_BIO_ACT_DESCRIPTION,
						WQX_ASSEMBLAGE_SAMPLED)));
		COLUMN_POSITION.put(KEY_ACT_COLLECTION_DURATION,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_BIO_ACT_DESCRIPTION,
						WQX_BIO_HABITAT_COLLECTION_INFO,
						WQX_COLLECTION_DURATION,
						WQX_MEASURE_VALUE)));
		COLUMN_POSITION.put(KEY_ACT_COLLECTION_DURATION_UNIT,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_BIO_ACT_DESCRIPTION,
						WQX_BIO_HABITAT_COLLECTION_INFO,
						WQX_COLLECTION_DURATION,
						WQX_MEASURE_UNIT)));
		COLUMN_POSITION.put(KEY_ACT_SAM_COMPNT_NAME,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_BIO_ACT_DESCRIPTION,
						WQX_BIO_HABITAT_COLLECTION_INFO,
						WQX_SAMPLING_COMPONENT)));
		COLUMN_POSITION.put(KEY_ACT_SAM_COMPNT_PLACE_IN_SERIES,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_BIO_ACT_DESCRIPTION,
						WQX_BIO_HABITAT_COLLECTION_INFO,
						WQX_SAMPLING_COMPONENT_PLACE)));
		COLUMN_POSITION.put(KEY_ACT_REACH_LENGTH,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_BIO_ACT_DESCRIPTION,
						WQX_BIO_HABITAT_COLLECTION_INFO,
						WQX_REACH_LENGTH,
						WQX_MEASURE_VALUE)));
		COLUMN_POSITION.put(KEY_ACT_REACH_LENGTH_UNIT,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_BIO_ACT_DESCRIPTION,
						WQX_BIO_HABITAT_COLLECTION_INFO,
						WQX_REACH_LENGTH,
						WQX_MEASURE_UNIT)));
		COLUMN_POSITION.put(KEY_ACT_REACH_WIDTH,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_BIO_ACT_DESCRIPTION,
						WQX_BIO_HABITAT_COLLECTION_INFO,
						WQX_REACH_WIDTH,
						WQX_MEASURE_VALUE)));
		COLUMN_POSITION.put(KEY_ACT_REACH_WIDTH_UNIT,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_BIO_ACT_DESCRIPTION,
						WQX_BIO_HABITAT_COLLECTION_INFO,
						WQX_REACH_WIDTH,
						WQX_MEASURE_UNIT)));
		COLUMN_POSITION.put(KEY_ACT_PASS_COUNT,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_BIO_ACT_DESCRIPTION,
						WQX_BIO_HABITAT_COLLECTION_INFO,
						WQX_PASS_COUNT)));
		COLUMN_POSITION.put(KEY_NET_TYPE_NAME,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_BIO_ACT_DESCRIPTION,
						WQX_BIO_HABITAT_COLLECTION_INFO,
						WQX_NET_INFORMATION,
						WQX_NET_TYPE)));
		COLUMN_POSITION.put(KEY_ACT_NET_SURFACE_AREA,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_BIO_ACT_DESCRIPTION,
						WQX_BIO_HABITAT_COLLECTION_INFO,
						WQX_NET_INFORMATION,
						WQX_NET_SURFACE_AREA,
						WQX_MEASURE_VALUE)));
		COLUMN_POSITION.put(KEY_ACT_NET_SURFACE_AREA_UNIT,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_BIO_ACT_DESCRIPTION,
						WQX_BIO_HABITAT_COLLECTION_INFO,
						WQX_NET_INFORMATION,
						WQX_NET_SURFACE_AREA,
						WQX_MEASURE_UNIT)));
		COLUMN_POSITION.put(KEY_ACT_NET_MESH_SIZE,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_BIO_ACT_DESCRIPTION,
						WQX_BIO_HABITAT_COLLECTION_INFO,
						WQX_NET_INFORMATION,
						WQX_NET_MESH_SIZE,
						WQX_MEASURE_VALUE)));
		COLUMN_POSITION.put(KEY_ACT_NET_MESH_SIZE_UNIT,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_BIO_ACT_DESCRIPTION,
						WQX_BIO_HABITAT_COLLECTION_INFO,
						WQX_NET_INFORMATION,
						WQX_NET_MESH_SIZE,
						WQX_MEASURE_UNIT)));
		COLUMN_POSITION.put(KEY_ACT_BOAT_SPEED,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_BIO_ACT_DESCRIPTION,
						WQX_BIO_HABITAT_COLLECTION_INFO,
						WQX_NET_INFORMATION,
						WQX_BOAT_SPEAD,
						WQX_MEASURE_VALUE)));
		COLUMN_POSITION.put(KEY_ACT_BOAT_SPEED_UNIT,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_BIO_ACT_DESCRIPTION,
						WQX_BIO_HABITAT_COLLECTION_INFO,
						WQX_NET_INFORMATION,
						WQX_BOAT_SPEAD,
						WQX_MEASURE_UNIT)));
		COLUMN_POSITION.put(KEY_ACT_CURRENT_SPEED,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_BIO_ACT_DESCRIPTION,
						WQX_BIO_HABITAT_COLLECTION_INFO,
						WQX_NET_INFORMATION,
						WQX_CURRENT_SPEAD,
						WQX_MEASURE_VALUE)));
		COLUMN_POSITION.put(KEY_ACT_CURRENT_SPEED_UNIT,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_BIO_ACT_DESCRIPTION,
						WQX_BIO_HABITAT_COLLECTION_INFO,
						WQX_NET_INFORMATION,
						WQX_CURRENT_SPEAD,
						WQX_MEASURE_UNIT)));
		COLUMN_POSITION.put(KEY_TOXICITY_TEST_TYPE_NAME,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_BIO_ACT_DESCRIPTION,
						WQX_TOXICITY_TEST_TYPE)));
		COLUMN_POSITION.put(KEY_SAMPLE_COLLECT_METHOD_ID,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_SAMPLE_DESCRIPTION,
						WQX_COLLECTION_METHOD,
						WQX_METHOD_ID)));
		COLUMN_POSITION.put(KEY_SAMPLE_COLLECT_METHOD_CTX,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_SAMPLE_DESCRIPTION,
						WQX_COLLECTION_METHOD,
						WQX_METHOD_CONTEXT)));
		COLUMN_POSITION.put(KEY_SAMPLE_COLLECT_METHOD_NAME,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_SAMPLE_DESCRIPTION,
						WQX_COLLECTION_METHOD,
						WQX_METHOD_NAME)));
		COLUMN_POSITION.put(KEY_ACT_SAM_COLLECT_METH_QUAL_TYPE,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_SAMPLE_DESCRIPTION,
						WQX_COLLECTION_METHOD,
						WQX_METHOD_QUALIFIER_TYPE)));
		COLUMN_POSITION.put(KEY_ACT_SAM_COLLECT_METH_DESC,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_SAMPLE_DESCRIPTION,
						WQX_COLLECTION_METHOD,
						WQX_METHOD_DESCRIPTION)));
		COLUMN_POSITION.put(KEY_SAMPLE_COLLECT_EQUIP_NAME,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_SAMPLE_DESCRIPTION,
						WQX_COLLECTION_EQUIPMENT)));
		COLUMN_POSITION.put(KEY_ACT_SAM_COLLECT_EQUIP_COMMENTS,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_SAMPLE_DESCRIPTION,
						WQX_COLLECTION_EQUIPMENT_COMMENT)));
		COLUMN_POSITION.put(KEY_ACT_SAM_PREP_METH_ID,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_SAMPLE_DESCRIPTION,
						WQX_SAMPLE_PREPARATION,
						WQX_SAMPLE_PREPARATION_METHOD,
						WQX_METHOD_ID)));
		COLUMN_POSITION.put(KEY_ACT_SAM_PREP_METH_CONTEXT,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_SAMPLE_DESCRIPTION,
						WQX_SAMPLE_PREPARATION,
						WQX_SAMPLE_PREPARATION_METHOD,
						WQX_METHOD_CONTEXT)));
		COLUMN_POSITION.put(KEY_ACT_SAM_PREP_METH_NAME,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_SAMPLE_DESCRIPTION,
						WQX_SAMPLE_PREPARATION,
						WQX_SAMPLE_PREPARATION_METHOD,
						WQX_METHOD_NAME)));
		COLUMN_POSITION.put(KEY_ACT_SAM_PREP_METH_QUAL_TYPE,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_SAMPLE_DESCRIPTION,
						WQX_SAMPLE_PREPARATION,
						WQX_SAMPLE_PREPARATION_METHOD,
						WQX_METHOD_QUALIFIER_TYPE)));
		COLUMN_POSITION.put(KEY_ACT_SAM_PREP_METH_DESC,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_SAMPLE_DESCRIPTION,
						WQX_SAMPLE_PREPARATION,
						WQX_SAMPLE_PREPARATION_METHOD,
						WQX_METHOD_DESCRIPTION)));
		COLUMN_POSITION.put(KEY_SAMPLE_CONTAINER_TYPE,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_SAMPLE_DESCRIPTION,
						WQX_SAMPLE_PREPARATION,
						WQX_SAMPLE_CONTAINER_TYPE)));
		COLUMN_POSITION.put(KEY_SAMPLE_CONTAINER_COLOR,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_SAMPLE_DESCRIPTION,
						WQX_SAMPLE_PREPARATION,
						WQX_SAMPLE_CONTAINER_COLOR)));
		COLUMN_POSITION.put(KEY_ACT_SAM_CHEMICAL_PRESERVATIVE,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_SAMPLE_DESCRIPTION,
						WQX_SAMPLE_PREPARATION,
						WQX_CHEMICAL_PRESERVATIVE)));
		COLUMN_POSITION.put(KEY_THERMAL_PRESERVATIVE_NAME,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_SAMPLE_DESCRIPTION,
						WQX_SAMPLE_PREPARATION,
						WQX_THERMAL_PRESERVATIVE)));
		COLUMN_POSITION.put(KEY_ACT_SAM_TRANSPORT_STORAGE_DESC,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_SAMPLE_DESCRIPTION,
						WQX_SAMPLE_PREPARATION,
						WQX_TRANSPORT_STORAGE)));
		COLUMN_POSITION.put(KEY_ACTIVITY_METRIC_URL,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_ACTIVITY_METRIC_URL)));
	}

	static {
		GROUPING.put(KEY_ORGANIZATION,
				new LinkedList<ColumnProfile>(Arrays.asList(ORGANIZATION, ORGANIZATION_NAME)));
		GROUPING.put(KEY_ACTIVITY,
				new LinkedList<ColumnProfile>(Arrays.asList(
						ACTIVITY,
						ACTIVITY_TYPE_CODE,
						SAMPLE_MEDIA,
						ACTIVITY_MEDIA_SUBDIV_NAME,
						EVENT_DATE,
						ACTIVITY_START_TIME,
						ACT_START_TIME_ZONE,
						ACTIVITY_STOP_DATE,
						ACTIVITY_STOP_TIME,
						ACT_STOP_TIME_ZONE,
						ACTIVITY_RELATIVE_DEPTH,
						ACTIVITY_DEPTH,
						ACTIVITY_DEPTH_UNIT,
						ACTIVITY_DEPTH_REF_POINT,
						ACTIVITY_UPPER_DEPTH,
						ACTIVITY_UPPER_DEPTH_UNIT,
						ACTIVITY_LOWER_DEPTH,
						ACTIVITY_LOWER_DEPTH_UNIT,
						PROJECT_ID,
						ACTIVITY_CONDUCTING_ORG,
						SITE_ID,
						ACTIVITY_COMMENT,
						SAMPLE_AQFR_NAME,
						HYDROLOGIC_CONDITION_NAME,
						HYDROLOGIC_EVENT_NAME,
						ACTIVITY_LATITUDE,
						ACTIVITY_LONGITUDE,
						ACTIVITY_SOURCE_MAP_SCALE,
						ACT_HORIZONTAL_ACCURACY,
						ACT_HORIZONTAL_ACCURACY_UNIT,
						ACT_HORIZONTAL_COLLECT_METHOD,
						ACT_HORIZONTAL_DATUM_NAME,
						ASSEMBLAGE_SAMPLED_NAME,
						ACT_COLLECTION_DURATION,
						ACT_COLLECTION_DURATION_UNIT,
						ACT_SAM_COMPNT_NAME,
						ACT_SAM_COMPNT_PLACE_IN_SERIES,
						ACT_REACH_LENGTH,
						ACT_REACH_LENGTH_UNIT,
						ACT_REACH_WIDTH,
						ACT_REACH_WIDTH_UNIT,
						ACT_PASS_COUNT,
						NET_TYPE_NAME,
						ACT_NET_SURFACE_AREA,
						ACT_NET_SURFACE_AREA_UNIT,
						ACT_NET_MESH_SIZE,
						ACT_NET_MESH_SIZE_UNIT,
						ACT_BOAT_SPEED,
						ACT_BOAT_SPEED_UNIT,
						ACT_CURRENT_SPEED,
						ACT_CURRENT_SPEED_UNIT,
						TOXICITY_TEST_TYPE_NAME,
						SAMPLE_COLLECT_METHOD_ID,
						SAMPLE_COLLECT_METHOD_CTX,
						SAMPLE_COLLECT_METHOD_NAME,
						ACT_SAM_COLLECT_METH_QUAL_TYPE,
						ACT_SAM_COLLECT_METH_DESC,
						SAMPLE_COLLECT_EQUIP_NAME,
						ACT_SAM_COLLECT_EQUIP_COMMENTS,
						ACT_SAM_PREP_METH_ID,
						ACT_SAM_PREP_METH_CONTEXT,
						ACT_SAM_PREP_METH_NAME,
						ACT_SAM_PREP_METH_QUAL_TYPE,
						ACT_SAM_PREP_METH_DESC,
						SAMPLE_CONTAINER_TYPE,
						SAMPLE_CONTAINER_COLOR,
						ACT_SAM_CHEMICAL_PRESERVATIVE,
						THERMAL_PRESERVATIVE_NAME,
						ACT_SAM_TRANSPORT_STORAGE_DESC,
						METRIC_TYPE_IDENTIFIER,
						METRIC_TYPE_CONTEXT,
						METRIC_TYPE_NAME,
						METRIC_CITATION_TITLE,
						METRIC_CITATION_CREATOR,
						METRIC_CITATION_SUBJECT,
						METRIC_CITATION_PUBLISHER,
						METRIC_CITATION_DATE,
						METRIC_CITATION_ID,
						METRIC_TYPE_SCALE,
						FORMULA_DESCRIPTION,
						ACTIVITY_METRIC_VALUE,
						ACTIVITY_METRIC_UNIT,
						ACTIVITY_METRIC_SCORE,
						ACTIVITY_METRIC_COMMENT,
						INDEX_IDENTIFIER,
						ACTIVITY_METRIC_URL
						)));
	}

	public String getEntryNodeName() {
		return WQX_ORGANIZATION;
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
}