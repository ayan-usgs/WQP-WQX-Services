package gov.usgs.cida.wqp.mapping;

import static gov.usgs.cida.wqp.mapping.BaseWqx.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class ResultColumn extends BaseColumn {

	// Result Keys
	public static final String KEY_ACTIVITY = "ACTIVITY";
	public static final String KEY_ACTIVITY_TYPE_CODE = "ACTIVITY_TYPE_CODE";
	public static final String KEY_SAMPLE_MEDIA = "SAMPLE_MEDIA";
	public static final String KEY_ACTIVITY_MEDIA_SUBDIV_NAME = "ACTIVITY_MEDIA_SUBDIV_NAME";
	public static final String KEY_EVENT_DATE = "EVENT_DATE";
	public static final String KEY_ACTIVITY_START_TIME = "ACTIVITY_START_TIME";
	public static final String KEY_ACT_START_TIME_ZONE = "ACT_START_TIME_ZONE";
	public static final String KEY_ACTIVITY_STOP_DATE = "ACTIVITY_STOP_DATE";
	public static final String KEY_ACTIVITY_STOP_TIME = "ACTIVITY_STOP_TIME";
	public static final String KEY_ACT_STOP_TIME_ZONE = "ACT_STOP_TIME_ZONE";
	public static final String KEY_ACTIVITY_DEPTH = "ACTIVITY_DEPTH";
	public static final String KEY_ACTIVITY_DEPTH_UNIT = "ACTIVITY_DEPTH_UNIT";
	public static final String KEY_ACTIVITY_DEPTH_REF_POINT = "ACTIVITY_DEPTH_REF_POINT";
	public static final String KEY_ACTIVITY_UPPER_DEPTH = "ACTIVITY_UPPER_DEPTH";
	public static final String KEY_ACTIVITY_UPPER_DEPTH_UNIT = "ACTIVITY_UPPER_DEPTH_UNIT";
	public static final String KEY_ACTIVITY_LOWER_DEPTH = "ACTIVITY_LOWER_DEPTH";
	public static final String KEY_ACTIVITY_LOWER_DEPTH_UNIT = "ACTIVITY_LOWER_DEPTH_UNIT";
	public static final String KEY_PROJECT_ID = "PROJECT_ID";
	public static final String KEY_ACTIVITY_CONDUCTING_ORG = "ACTIVITY_CONDUCTING_ORG";
	public static final String KEY_ACTIVITY_COMMENT = "ACTIVITY_COMMENT";
	public static final String KEY_SAMPLE_AQFR_NAME = "SAMPLE_AQFR_NAME";
	public static final String KEY_HYDROLOGIC_CONDITION_NAME = "HYDROLOGIC_CONDITION_NAME";
	public static final String KEY_HYDROLOGIC_EVENT_NAME = "HYDROLOGIC_EVENT_NAME";
	public static final String KEY_SAMPLE_COLLECT_METHOD_ID = "SAMPLE_COLLECT_METHOD_ID";
	public static final String KEY_SAMPLE_COLLECT_METHOD_CTX = "SAMPLE_COLLECT_METHOD_CTX";
	public static final String KEY_SAMPLE_COLLECT_METHOD_NAME = "SAMPLE_COLLECT_METHOD_NAME";
	public static final String KEY_SAMPLE_COLLECT_EQUIP_NAME = "SAMPLE_COLLECT_EQUIP_NAME";
	public static final String KEY_RESULT_ID = "RESULT_ID";
	public static final String KEY_RESULT_DETECTION_CONDITION_TX = "RESULT_DETECTION_CONDITION_TX";
	public static final String KEY_CHARACTERISTIC_NAME = "CHARACTERISTIC_NAME";
	public static final String KEY_SAMPLE_FRACTION_TYPE = "SAMPLE_FRACTION_TYPE";
	public static final String KEY_RESULT_MEASURE_VALUE = "RESULT_MEASURE_VALUE";
	public static final String KEY_RESULT_UNIT = "RESULT_UNIT";
	public static final String KEY_RESULT_MEAS_QUAL_CODE = "RESULT_MEAS_QUAL_CODE";
	public static final String KEY_RESULT_VALUE_STATUS = "RESULT_VALUE_STATUS";
	public static final String KEY_STATISTIC_TYPE = "STATISTIC_TYPE";
	public static final String KEY_RESULT_VALUE_TYPE = "RESULT_VALUE_TYPE";
	public static final String KEY_WEIGHT_BASIS_TYPE = "WEIGHT_BASIS_TYPE";
	public static final String KEY_DURATION_BASIS = "DURATION_BASIS";
	public static final String KEY_TEMPERATURE_BASIS_LEVEL = "TEMPERATURE_BASIS_LEVEL";
	public static final String KEY_PARTICLE_SIZE = "PARTICLE_SIZE";
	public static final String KEY_PRECISION = "PRECISION";
	public static final String KEY_RESULT_COMMENT = "RESULT_COMMENT";
	public static final String KEY_P_CODE = "P_CODE";
	public static final String KEY_RESULT_DEPTH_MEAS_VALUE = "RESULT_DEPTH_MEAS_VALUE";
	public static final String KEY_RESULT_DEPTH_MEAS_UNIT_CODE = "RESULT_DEPTH_MEAS_UNIT_CODE";
	public static final String KEY_RESULT_DEPTH_ALT_REF_PT_TXT = "RESULT_DEPTH_ALT_REF_PT_TXT";
	public static final String KEY_SAMPLE_TISSUE_TAXONOMIC_NAME = "SAMPLE_TISSUE_TAXONOMIC_NAME";
	public static final String KEY_SAMPLE_TISSUE_ANATOMY_NAME = "SAMPLE_TISSUE_ANATOMY_NAME";
	public static final String KEY_ANALYTICAL_PROCEDURE_ID = "ANALYTICAL_PROCEDURE_ID";
	public static final String KEY_ANALYTICAL_PROCEDURE_SOURCE = "ANALYTICAL_PROCEDURE_SOURCE";
	public static final String KEY_ANALYTICAL_METHOD_NAME = "ANALYTICAL_METHOD_NAME";
	public static final String KEY_ANALYTICAL_METHOD_CITATION = "ANALYTICAL_METHOD_CITATION";
	public static final String KEY_LAB_NAME = "LAB_NAME";
	public static final String KEY_ANALYSIS_DATE_TIME = "ANALYSIS_DATE_TIME";
	public static final String KEY_LAB_REMARK = "LAB_REMARK";
	public static final String KEY_DETECTION_LIMIT_DESC = "DETECTION_LIMIT_DESC";
	public static final String KEY_DETECTION_LIMIT = "DETECTION_LIMIT";
	public static final String KEY_DETECTION_LIMIT_UNIT = "DETECTION_LIMIT_UNIT";
	public static final String KEY_ANALYSIS_PREP_DATE_TX = "ANALYSIS_PREP_DATE_TX";


	public static final String VALUE_ACTIVITY = WQX_ACT_ID;
	public static final String VALUE_ACTIVITY_TYPE_CODE = WQX_ACT_TYPE;
	public static final String VALUE_SAMPLE_MEDIA = WQX_ACT_MEDIA;
	public static final String VALUE_ACTIVITY_MEDIA_SUBDIV_NAME = WQX_ACT_MEDIA_SUB;
	public static final String VALUE_EVENT_DATE = WQX_ACT_START_DATE;
	public static final String VALUE_ACTIVITY_START_TIME = WQX_ACT_START_TIME + VAL_DEL + WQX_TIME;
	public static final String VALUE_ACT_START_TIME_ZONE = WQX_ACT_START_TIME + VAL_DEL + WQX_TIME_ZONE;
	public static final String VALUE_ACTIVITY_STOP_DATE = WQX_ACT_END_DATE;
	public static final String VALUE_ACTIVITY_STOP_TIME = WQX_ACT_END_TIME + VAL_DEL + WQX_TIME;
	public static final String VALUE_ACT_STOP_TIME_ZONE = WQX_ACT_END_TIME + VAL_DEL + WQX_TIME_ZONE;
	public static final String VALUE_ACTIVITY_DEPTH = WQX_ACT_DEPTH + VAL_DEL + WQX_MEASURE_VALUE;
	public static final String VALUE_ACTIVITY_DEPTH_UNIT = WQX_ACT_DEPTH + VAL_DEL + WQX_MEASURE_UNIT;
	public static final String VALUE_ACTIVITY_DEPTH_REF_POINT = WQX_ACT_DEPTH_REFERENCE;
	public static final String VALUE_ACTIVITY_UPPER_DEPTH = WQX_ACT_TOP_DEPTH + VAL_DEL + WQX_MEASURE_VALUE;
	public static final String VALUE_ACTIVITY_UPPER_DEPTH_UNIT = WQX_ACT_TOP_DEPTH + VAL_DEL + WQX_MEASURE_UNIT;
	public static final String VALUE_ACTIVITY_LOWER_DEPTH = WQX_ACT_BOTTOM_DEPTH + VAL_DEL + WQX_MEASURE_VALUE;
	public static final String VALUE_ACTIVITY_LOWER_DEPTH_UNIT = WQX_ACT_BOTTOM_DEPTH + VAL_DEL + WQX_MEASURE_UNIT;
	public static final String VALUE_PROJECT_ID = WQX_PROJECT;
	public static final String VALUE_ACTIVITY_CONDUCTING_ORG = WQX_ACT_CONDUCTION_ORG;
	public static final String VALUE_ACTIVITY_COMMENT = WQX_ACT_COMMENT;
	public static final String VALUE_SAMPLE_AQFR_NAME = WQX_SAMPLE_AQUIFER;
	public static final String VALUE_HYDROLOGIC_CONDITION_NAME = WQX_HYDROLOGIC_CONDITION;
	public static final String VALUE_HYDROLOGIC_EVENT_NAME = WQX_HYDROLOGIC_EVENT;
	public static final String VALUE_SAMPLE_COLLECT_METHOD_ID = WQX_COLLECTION_METHOD + VAL_DEL + WQX_METHOD_ID;
	public static final String VALUE_SAMPLE_COLLECT_METHOD_CTX = WQX_COLLECTION_METHOD + VAL_DEL + WQX_METHOD_CONTEXT;
	public static final String VALUE_SAMPLE_COLLECT_METHOD_NAME = WQX_COLLECTION_METHOD + VAL_DEL + WQX_METHOD_NAME;
	public static final String VALUE_SAMPLE_COLLECT_EQUIP_NAME = WQX_COLLECTION_EQUIPMENT;
	public static final String VALUE_RESULT_DETECTION_CONDITION_TX = WQX_DETECTION_CONDITION;
	public static final String VALUE_CHARACTERISTIC_NAME = WQX_CHAR_NAME;
	public static final String VALUE_SAMPLE_FRACTION_TYPE = WQX_SAMPLE_FRACTION;
	public static final String VALUE_RESULT_MEASURE_VALUE = WQX_RESULT_MEASURE_VALUE;
	public static final String VALUE_RESULT_UNIT = WQX_RESULT_MEASURE + VAL_DEL + WQX_MEASURE_UNIT;
	public static final String VALUE_RESULT_MEAS_QUAL_CODE = WQX_MEASURE_QUALIFIER;
	public static final String VALUE_RESULT_VALUE_STATUS = WQX_STATUS_ID;
	public static final String VALUE_STATISTIC_TYPE = WQX_STATISTICAL_BASE;
	public static final String VALUE_RESULT_VALUE_TYPE = WQX_VALUE_TYPE;
	public static final String VALUE_WEIGHT_BASIS_TYPE = WQX_WEIGHT_BASIS;
	public static final String VALUE_DURATION_BASIS = WQX_TIME_BASIS;
	public static final String VALUE_TEMPERATURE_BASIS_LEVEL = WQX_TEMP_BASIS;
	public static final String VALUE_PARTICLE_SIZE = WQX_PARTICLE_SIZE;
	public static final String VALUE_PRECISION = WQX_PRECISION;
	public static final String VALUE_RESULT_COMMENT = WQX_RESULT_COMMENT;
	public static final String VALUE_P_CODE = WQX_P_CODE;
	public static final String VALUE_RESULT_DEPTH_MEAS_VALUE = WQX_RESULT_DEPTH + VAL_DEL + WQX_MEASURE_VALUE;
	public static final String VALUE_RESULT_DEPTH_MEAS_UNIT_CODE = WQX_RESULT_DEPTH + VAL_DEL + WQX_MEASURE_UNIT;
	public static final String VALUE_RESULT_DEPTH_ALT_REF_PT_TXT = WQX_RESULT_DETH_REFERENCE;
	public static final String VALUE_SAMPLE_TISSUE_TAXONOMIC_NAME = WQX_TAXON_NAME;
	public static final String VALUE_SAMPLE_TISSUE_ANATOMY_NAME = WQX_TISSUE_ANATOMY;
	public static final String VALUE_ANALYTICAL_PROCEDURE_ID = WQX_ANALYTICAL_METHOD + VAL_DEL + WQX_METHOD_ID;
	public static final String VALUE_ANALYTICAL_PROCEDURE_SOURCE = WQX_ANALYTICAL_METHOD + VAL_DEL + WQX_METHOD_CONTEXT;
	public static final String VALUE_ANALYTICAL_METHOD_NAME = WQX_ANALYTICAL_METHOD + VAL_DEL + WQX_METHOD_NAME;
	public static final String VALUE_ANALYTICAL_METHOD_CITATION = WQX_METHOD_DESCRIPTION;
	public static final String VALUE_LAB_NAME = WQX_LAB_NAME;
	public static final String VALUE_ANALYSIS_DATE_TIME = WQX_ANALYSIS_START_DATE;
	public static final String VALUE_LAB_REMARK = WQX_LAB_COMMENT;
	public static final String VALUE_DETECTION_LIMIT_DESC = WQX_DETECTION_LIMIT_TYPE;
	public static final String VALUE_DETECTION_LIMIT = WQX_DETECTION_LIMIT_VALUE + VAL_DEL + WQX_MEASURE_VALUE;
	public static final String VALUE_DETECTION_LIMIT_UNIT = WQX_DETECTION_LIMIT_VALUE + VAL_DEL + WQX_MEASURE_UNIT;
	public static final String VALUE_ANALYSIS_PREP_DATE_TX = WQX_PREP_START_DATE;
	

	public static final Map<String, String> mappings;
		
	static {
		mappings = new LinkedHashMap<String,String>();
		mappings.put(KEY_ORGANIZATION, VALUE_ORGANIZATION_IDENTIFIER);
		mappings.put(KEY_ORGANIZATION_NAME, VALUE_ORGANIZATION_FORMAL_NAME);
		mappings.put(KEY_ACTIVITY, VALUE_ACTIVITY);
		mappings.put(KEY_ACTIVITY_TYPE_CODE, VALUE_ACTIVITY_TYPE_CODE);
		mappings.put(KEY_SAMPLE_MEDIA, VALUE_SAMPLE_MEDIA);
		mappings.put(KEY_ACTIVITY_MEDIA_SUBDIV_NAME, VALUE_ACTIVITY_MEDIA_SUBDIV_NAME);
		mappings.put(KEY_EVENT_DATE, VALUE_EVENT_DATE);
		mappings.put(KEY_ACTIVITY_START_TIME, VALUE_ACTIVITY_START_TIME);
		mappings.put(KEY_ACT_START_TIME_ZONE, VALUE_ACT_START_TIME_ZONE);
		mappings.put(KEY_ACTIVITY_STOP_DATE, VALUE_ACTIVITY_STOP_DATE);
		mappings.put(KEY_ACTIVITY_STOP_TIME, VALUE_ACTIVITY_STOP_TIME);
		mappings.put(KEY_ACT_STOP_TIME_ZONE, VALUE_ACT_STOP_TIME_ZONE);
		mappings.put(KEY_ACTIVITY_DEPTH, VALUE_ACTIVITY_DEPTH);
		mappings.put(KEY_ACTIVITY_DEPTH_UNIT, VALUE_ACTIVITY_DEPTH_UNIT);
		mappings.put(KEY_ACTIVITY_DEPTH_REF_POINT, VALUE_ACTIVITY_DEPTH_REF_POINT);
		mappings.put(KEY_ACTIVITY_UPPER_DEPTH, VALUE_ACTIVITY_UPPER_DEPTH);
		mappings.put(KEY_ACTIVITY_UPPER_DEPTH_UNIT, VALUE_ACTIVITY_UPPER_DEPTH_UNIT);
		mappings.put(KEY_ACTIVITY_LOWER_DEPTH, VALUE_ACTIVITY_LOWER_DEPTH);
		mappings.put(KEY_ACTIVITY_LOWER_DEPTH_UNIT, VALUE_ACTIVITY_LOWER_DEPTH_UNIT);
		mappings.put(KEY_PROJECT_ID, VALUE_PROJECT_ID);
		mappings.put(KEY_ACTIVITY_CONDUCTING_ORG, VALUE_ACTIVITY_CONDUCTING_ORG);
		mappings.put(KEY_SITE_ID, VALUE_MONITORING_LOCATION_IDENTIFIER);
		mappings.put(KEY_ACTIVITY_COMMENT, VALUE_ACTIVITY_COMMENT);
		mappings.put(KEY_SAMPLE_AQFR_NAME, VALUE_SAMPLE_AQFR_NAME);
		mappings.put(KEY_HYDROLOGIC_CONDITION_NAME, VALUE_HYDROLOGIC_CONDITION_NAME);
		mappings.put(KEY_HYDROLOGIC_EVENT_NAME, VALUE_HYDROLOGIC_EVENT_NAME);
		mappings.put(KEY_SAMPLE_COLLECT_METHOD_ID, VALUE_SAMPLE_COLLECT_METHOD_ID);
		mappings.put(KEY_SAMPLE_COLLECT_METHOD_CTX, VALUE_SAMPLE_COLLECT_METHOD_CTX);
		mappings.put(KEY_SAMPLE_COLLECT_METHOD_NAME, VALUE_SAMPLE_COLLECT_METHOD_NAME);
		mappings.put(KEY_SAMPLE_COLLECT_EQUIP_NAME, VALUE_SAMPLE_COLLECT_EQUIP_NAME);
		mappings.put(KEY_RESULT_DETECTION_CONDITION_TX, VALUE_RESULT_DETECTION_CONDITION_TX);
		mappings.put(KEY_CHARACTERISTIC_NAME, VALUE_CHARACTERISTIC_NAME);
		mappings.put(KEY_SAMPLE_FRACTION_TYPE, VALUE_SAMPLE_FRACTION_TYPE);
		mappings.put(KEY_RESULT_MEASURE_VALUE, VALUE_RESULT_MEASURE_VALUE);
		mappings.put(KEY_RESULT_UNIT, VALUE_RESULT_UNIT);
		mappings.put(KEY_RESULT_MEAS_QUAL_CODE, VALUE_RESULT_MEAS_QUAL_CODE);
		mappings.put(KEY_RESULT_VALUE_STATUS, VALUE_RESULT_VALUE_STATUS);
		mappings.put(KEY_STATISTIC_TYPE, VALUE_STATISTIC_TYPE);
		mappings.put(KEY_RESULT_VALUE_TYPE, VALUE_RESULT_VALUE_TYPE);
		mappings.put(KEY_WEIGHT_BASIS_TYPE, VALUE_WEIGHT_BASIS_TYPE);
		mappings.put(KEY_DURATION_BASIS, VALUE_DURATION_BASIS);
		mappings.put(KEY_TEMPERATURE_BASIS_LEVEL, VALUE_TEMPERATURE_BASIS_LEVEL);
		mappings.put(KEY_PARTICLE_SIZE, VALUE_PARTICLE_SIZE);
		mappings.put(KEY_PRECISION, VALUE_PRECISION);
		mappings.put(KEY_RESULT_COMMENT, VALUE_RESULT_COMMENT);
		mappings.put(KEY_P_CODE, VALUE_P_CODE);
		mappings.put(KEY_RESULT_DEPTH_MEAS_VALUE, VALUE_RESULT_DEPTH_MEAS_VALUE);
		mappings.put(KEY_RESULT_DEPTH_MEAS_UNIT_CODE, VALUE_RESULT_DEPTH_MEAS_UNIT_CODE);
		mappings.put(KEY_RESULT_DEPTH_ALT_REF_PT_TXT, VALUE_RESULT_DEPTH_ALT_REF_PT_TXT);
		mappings.put(KEY_SAMPLE_TISSUE_TAXONOMIC_NAME, VALUE_SAMPLE_TISSUE_TAXONOMIC_NAME);
		mappings.put(KEY_SAMPLE_TISSUE_ANATOMY_NAME, VALUE_SAMPLE_TISSUE_ANATOMY_NAME);
		mappings.put(KEY_ANALYTICAL_PROCEDURE_ID, VALUE_ANALYTICAL_PROCEDURE_ID);
		mappings.put(KEY_ANALYTICAL_PROCEDURE_SOURCE, VALUE_ANALYTICAL_PROCEDURE_SOURCE);
		mappings.put(KEY_ANALYTICAL_METHOD_NAME, VALUE_ANALYTICAL_METHOD_NAME);
		mappings.put(KEY_ANALYTICAL_METHOD_CITATION, VALUE_ANALYTICAL_METHOD_CITATION);
		mappings.put(KEY_LAB_NAME, VALUE_LAB_NAME);
		mappings.put(KEY_ANALYSIS_DATE_TIME, VALUE_ANALYSIS_DATE_TIME);
		mappings.put(KEY_LAB_REMARK, VALUE_LAB_REMARK);
		mappings.put(KEY_DETECTION_LIMIT_DESC, VALUE_DETECTION_LIMIT_DESC);
		mappings.put(KEY_DETECTION_LIMIT, VALUE_DETECTION_LIMIT);
		mappings.put(KEY_DETECTION_LIMIT_UNIT, VALUE_DETECTION_LIMIT_UNIT);
		mappings.put(KEY_ANALYSIS_PREP_DATE_TX, VALUE_ANALYSIS_PREP_DATE_TX);
		mappings.put(KEY_DATA_SOURCE, VALUE_DATA_SOURCE);
		
	}
	
}
