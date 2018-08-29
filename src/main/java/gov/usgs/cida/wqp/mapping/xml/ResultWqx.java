package gov.usgs.cida.wqp.mapping.xml;

import static gov.usgs.cida.wqp.mapping.ResultColumn.*;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import gov.usgs.cida.wqp.mapping.ColumnProfile;

@Component
public class ResultWqx extends BaseWqx implements IXmlMapping {

	public static final Map<String, String> HARD_BREAK = new LinkedHashMap<>();

	public static final Map<String, List<String>> COLUMN_POSITION = new LinkedHashMap<>();

	public static final Map<String, List<ColumnProfile>> GROUPING = new LinkedHashMap<>();

	static {
		HARD_BREAK.putAll(ActivityWqx.HARD_BREAK);
		HARD_BREAK.put(KEY_RESULT_ID, WQX_ACTIVITY);
	}


	static {
		COLUMN_POSITION.putAll(ActivityWqx.COLUMN_POSITION);

		COLUMN_POSITION.put(KEY_EXTERNAL_RESULT_ID,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_RESULT_DESRIPTION,
						WQX_RESULT_IDENTIFIER)));

		COLUMN_POSITION.put(KEY_RESULT_DETECTION_CONDITION_TX,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_RESULT_DESRIPTION,
						WQX_DETECTION_CONDITION)));
		COLUMN_POSITION.put(KEY_CHARACTERISTIC_NAME,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_RESULT_DESRIPTION,
						WQX_CHAR_NAME)));
		COLUMN_POSITION.put(KEY_RES_DATA_LOGGER_LINE,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_RESULT_DESRIPTION,
						WQX_DATA_LOGGER_LINE)));


		//Note that "SPECIATION" is correct and "SPECIFICATION" is a typo.
		COLUMN_POSITION.put(KEY_METHOD_SPECIATION_NAME,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_RESULT_DESRIPTION,
						WQX_METHOD_SPECIATION)));
		COLUMN_POSITION.put(KEY_METHOD_SPECIFICATION_NAME,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_RESULT_DESRIPTION,
						WQX_METHOD_SPECIFICATION)));


		COLUMN_POSITION.put(KEY_SAMPLE_FRACTION_TYPE,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_RESULT_DESRIPTION,
						WQX_SAMPLE_FRACTION)));
		COLUMN_POSITION.put(KEY_RESULT_MEASURE_VALUE,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_RESULT_DESRIPTION,
						WQX_RESULT_MEASURE,
						WQX_RESULT_MEASURE_VALUE
						)));
		COLUMN_POSITION.put(KEY_RESULT_UNIT,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_RESULT_DESRIPTION,
						WQX_RESULT_MEASURE,
						WQX_MEASURE_UNIT)));
		COLUMN_POSITION.put(KEY_RESULT_MEAS_QUAL_CODE,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_RESULT_DESRIPTION,
						WQX_RESULT_MEASURE,
						WQX_MEASURE_QUALIFIER)));
		COLUMN_POSITION.put(KEY_RESULT_VALUE_STATUS,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_RESULT_DESRIPTION,
						WQX_STATUS_ID)));
		COLUMN_POSITION.put(KEY_STATISTIC_TYPE,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_RESULT_DESRIPTION,
						WQX_STATISTICAL_BASE)));
		COLUMN_POSITION.put(KEY_RESULT_VALUE_TYPE,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_RESULT_DESRIPTION,
						WQX_VALUE_TYPE)));
		COLUMN_POSITION.put(KEY_WEIGHT_BASIS_TYPE,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_RESULT_DESRIPTION,
						WQX_WEIGHT_BASIS)));
		COLUMN_POSITION.put(KEY_DURATION_BASIS,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_RESULT_DESRIPTION,
						WQX_TIME_BASIS)));
		COLUMN_POSITION.put(KEY_TEMPERATURE_BASIS_LEVEL,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_RESULT_DESRIPTION,
						WQX_TEMP_BASIS)));
		COLUMN_POSITION.put(KEY_PARTICLE_SIZE,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_RESULT_DESRIPTION,
						WQX_PARTICLE_SIZE)));
		COLUMN_POSITION.put(KEY_PRECISION,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_RESULT_DESRIPTION,
						WQX_DATA_QUALITY,
						WQX_PRECISION)));

		COLUMN_POSITION.put(KEY_RES_MEASURE_BIAS,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_RESULT_DESRIPTION,
						WQX_DATA_QUALITY,
						WQX_BIAS)));
		COLUMN_POSITION.put(KEY_RES_MEASURE_CONF_INTERVAL,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_RESULT_DESRIPTION,
						WQX_DATA_QUALITY,
						WQX_CONFIDENCE_INTERVAL)));
		COLUMN_POSITION.put(KEY_RES_MEASURE_UPPER_CONF_LIMIT,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_RESULT_DESRIPTION,
						WQX_DATA_QUALITY,
						WQX_UPPER_CONFIDENCE_LIMIT)));
		COLUMN_POSITION.put(KEY_RES_MEASURE_LOWER_CONF_LIMIT,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_RESULT_DESRIPTION,
						WQX_DATA_QUALITY,
						WQX_LOWER_CONFIDENCE_LIMIT)));

		COLUMN_POSITION.put(KEY_RESULT_COMMENT,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_RESULT_DESRIPTION,
						WQX_RESULT_COMMENT)));
		COLUMN_POSITION.put(KEY_P_CODE,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_RESULT_DESRIPTION,
						WQX_P_CODE)));
		COLUMN_POSITION.put(KEY_RESULT_DEPTH_MEAS_VALUE,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_RESULT_DESRIPTION,
						WQX_RESULT_DEPTH,
						WQX_MEASURE_VALUE)));
		COLUMN_POSITION.put(KEY_RESULT_DEPTH_MEAS_UNIT_CODE,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_RESULT_DESRIPTION,
						WQX_RESULT_DEPTH,
						WQX_MEASURE_UNIT)));
		COLUMN_POSITION.put(KEY_RESULT_DEPTH_ALT_REF_PT_TXT,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_RESULT_DESRIPTION,
						WQX_RESULT_DETH_REFERENCE)));

		COLUMN_POSITION.put(KEY_RES_SAMPLING_POINT_NAME,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_RESULT_DESRIPTION,
						WQX_RESULT_SAMPLING_POINT)));
		
		COLUMN_POSITION.put(KEY_BIOLOGICAL_INTENT,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_BIOLOGICAL_RESULT,
						WQX_BIOLOGICAL_INTENT)));
		COLUMN_POSITION.put(KEY_RES_BIO_INDIVIDUAL_ID,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_BIOLOGICAL_RESULT,
						WQX_BIOLOGICAL_INDIVIDUAL_ID)));

		COLUMN_POSITION.put(KEY_SAMPLE_TISSUE_TAXONOMIC_NAME,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_BIOLOGICAL_RESULT,
						WQX_TAXON_NAME)));

		COLUMN_POSITION.put(KEY_UNIDENTIFIEDSPECIESIDENTIFIER,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_BIOLOGICAL_RESULT,
						WQX_UNIDENTIFIED_SPECIES_IDENTIFIER)));

		COLUMN_POSITION.put(KEY_SAMPLE_TISSUE_ANATOMY_NAME,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_BIOLOGICAL_RESULT,
						WQX_TISSUE_ANATOMY)));

		COLUMN_POSITION.put(KEY_RES_GROUP_SUMMARY_CT_WT,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_BIOLOGICAL_RESULT,
						WQX_GROUP_SUMMARY_COUNT_WEIGHT,
						WQX_MEASURE_VALUE)));
		COLUMN_POSITION.put(KEY_RES_GROUP_SUMMARY_CT_WT_UNIT,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_BIOLOGICAL_RESULT,
						WQX_GROUP_SUMMARY_COUNT_WEIGHT,
						WQX_MEASURE_UNIT)));
		COLUMN_POSITION.put(KEY_CELL_FORM_NAME,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_BIOLOGICAL_RESULT,
						WQX_TAXONOMIC_DETAILS,
						WQX_CELL_FORM)));
		COLUMN_POSITION.put(KEY_CELL_SHAPE_NAME,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_BIOLOGICAL_RESULT,
						WQX_TAXONOMIC_DETAILS,
						WQX_CELL_SHAPE)));
		COLUMN_POSITION.put(KEY_HABIT_NAME,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_BIOLOGICAL_RESULT,
						WQX_TAXONOMIC_DETAILS,
						WQX_HABIT)));
		COLUMN_POSITION.put(KEY_VOLT_NAME,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_BIOLOGICAL_RESULT,
						WQX_TAXONOMIC_DETAILS,
						WQX_VOLTISM)));
		COLUMN_POSITION.put(KEY_RTDET_POLLUTION_TOLERANCE,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_BIOLOGICAL_RESULT,
						WQX_TAXONOMIC_DETAILS,
						WQX_POLLUTION_TOLERANCE)));
		COLUMN_POSITION.put(KEY_RTDET_POLLUTION_TOLERNCE_SCALE,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_BIOLOGICAL_RESULT,
						WQX_TAXONOMIC_DETAILS,
						WQX_TOLERANCE_SCALE)));
		COLUMN_POSITION.put(KEY_RTDET_TROPHIC_LEVEL,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_BIOLOGICAL_RESULT,
						WQX_TAXONOMIC_DETAILS,
						WQX_TROPHIC_LEVEL)));
		COLUMN_POSITION.put(KEY_RTFGRP_FUNCTIONAL_FEEDING_GRP,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_BIOLOGICAL_RESULT,
						WQX_TAXONOMIC_DETAILS,
						WQX_FUNCTIONAL_FEEDING_GROUP)));
		COLUMN_POSITION.put(KEY_TAXON_CITATION_TITLE,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_BIOLOGICAL_RESULT,
						WQX_TAXONOMIC_DETAILS,
						WQX_TAXONIMC_DETAIL_CITATION,
						WQX_RESOURCE_TITLE)));
		COLUMN_POSITION.put(KEY_TAXON_CITATION_CREATOR,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_BIOLOGICAL_RESULT,
						WQX_TAXONOMIC_DETAILS,
						WQX_TAXONIMC_DETAIL_CITATION,
						WQX_RESOURCE_CREATOR)));
		COLUMN_POSITION.put(KEY_TAXON_CITATION_SUBJECT,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_BIOLOGICAL_RESULT,
						WQX_TAXONOMIC_DETAILS,
						WQX_TAXONIMC_DETAIL_CITATION,
						WQX_RESOURCE_SUBJECT)));
		COLUMN_POSITION.put(KEY_TAXON_CITATION_PUBLISHER,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_BIOLOGICAL_RESULT,
						WQX_TAXONOMIC_DETAILS,
						WQX_TAXONIMC_DETAIL_CITATION,
						WQX_RESOURCE_PUBLISHER)));
		COLUMN_POSITION.put(KEY_TAXON_CITATION_DATE,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_BIOLOGICAL_RESULT,
						WQX_TAXONOMIC_DETAILS,
						WQX_TAXONIMC_DETAIL_CITATION,
						WQX_RESOURCE_DATE)));
		COLUMN_POSITION.put(KEY_TAXON_CITATION_ID,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_BIOLOGICAL_RESULT,
						WQX_TAXONOMIC_DETAILS,
						WQX_TAXONIMC_DETAIL_CITATION,
						WQX_RESOURCE_ID)));
		COLUMN_POSITION.put(KEY_FCDSC_URL,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_BIOLOGICAL_RESULT,
						WQX_FREQUENCY_CLASS_INFO,
						WQX_FREQUENCY_CLASS_INFO_URL)));
		COLUMN_POSITION.put(KEY_FCDSC_NAME,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_BIOLOGICAL_RESULT,
						WQX_FREQUENCY_CLASS_INFO,
						WQX_FREQUENCY_CLASS_DESCRIPTOR)));
		COLUMN_POSITION.put(KEY_FREQUENCY_CLASS_UNIT,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_BIOLOGICAL_RESULT,
						WQX_FREQUENCY_CLASS_INFO,
						WQX_FREQUENCE_CLASS_DESCRIPTOR_UNIT)));
		COLUMN_POSITION.put(KEY_FCDSC_LOWER_BOUND,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_BIOLOGICAL_RESULT,
						WQX_FREQUENCY_CLASS_INFO,
						WQX_LOWER_CLASS_BOUND)));
		COLUMN_POSITION.put(KEY_FCDSC_UPPER_BOUND,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_BIOLOGICAL_RESULT,
						WQX_FREQUENCY_CLASS_INFO,
						WQX_UPPER_CLASS_BOUND)));


		COLUMN_POSITION.put(KEY_RESULT_OBJECT_NAME, 
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_ATTACHED_BINARY_OBJECT,
						WQX_FILE_NAME
						)));
		COLUMN_POSITION.put(KEY_RESULT_OBJECT_NAME, 
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_ATTACHED_BINARY_OBJECT,
						WQX_FILE_TYPE
						)));
		COLUMN_POSITION.put(KEY_RESULT_FILE_URL,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_ATTACHED_BINARY_OBJECT,
						WQX_RESULT_FILE_URL
						)));


		COLUMN_POSITION.put(KEY_ANALYTICAL_PROCEDURE_ID,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_ANALYTICAL_METHOD,
						WQX_METHOD_ID)));
		COLUMN_POSITION.put(KEY_ANALYTICAL_PROCEDURE_SOURCE,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_ANALYTICAL_METHOD,
						WQX_METHOD_CONTEXT)));
		COLUMN_POSITION.put(KEY_ANALYTICAL_METHOD_NAME,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_ANALYTICAL_METHOD,
						WQX_METHOD_NAME)));

		COLUMN_POSITION.put(KEY_ANLMTH_QUAL_TYPE,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_ANALYTICAL_METHOD,
						WQX_METHOD_QUALIFIER_TYPE)));

		COLUMN_POSITION.put(KEY_ANALYTICAL_METHOD_CITATION,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_ANALYTICAL_METHOD,
						WQX_METHOD_DESCRIPTION)));
		COLUMN_POSITION.put(KEY_METHOD_URL,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_ANALYTICAL_METHOD,
						WQX_METHOD_URL)));

		COLUMN_POSITION.put(KEY_LAB_NAME,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_LAB_INFO,
						WQX_LAB_NAME)));
		COLUMN_POSITION.put(KEY_ANALYSIS_START_DATE,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_LAB_INFO,
						WQX_ANALYSIS_START_DATE)));

		COLUMN_POSITION.put(KEY_ANALYSIS_START_TIME,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_LAB_INFO,
						WQX_ANALYSIS_START_TIME,
						WQX_TIME)));
		COLUMN_POSITION.put(KEY_ANALYSIS_START_TIMEZONE,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_LAB_INFO,
						WQX_ANALYSIS_START_TIME,
						WQX_TIME_ZONE)));
		COLUMN_POSITION.put(KEY_ANALYSIS_END_DATE,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_LAB_INFO,
						WQX_ANALYSIS_END_DATE)));
		COLUMN_POSITION.put(KEY_ANALYSIS_END_TIME,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_LAB_INFO,
						WQX_ANALYSIS_END_TIME,
						WQX_TIME)));
		COLUMN_POSITION.put(KEY_ANALYSIS_END_TIMEZONE,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_LAB_INFO,
						WQX_ANALYSIS_END_TIME,
						WQX_TIME_ZONE)));
		COLUMN_POSITION.put(KEY_RLCOM_CD,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_LAB_INFO,
						WQX_LAB_COMMENT_CODE)));

		COLUMN_POSITION.put(KEY_LAB_REMARK,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_LAB_INFO,
						WQX_LAB_COMMENT)));
		COLUMN_POSITION.put(KEY_RES_DETECT_QNT_LMT_URL,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_LAB_INFO,
						WQX_DETECTION_LIMIT,
						WQX_DETECTION_LIMIT_URL)));
		COLUMN_POSITION.put(KEY_DETECTION_LIMIT,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_LAB_INFO,
						WQX_DETECTION_LIMIT,
						WQX_DETECTION_LIMIT_VALUE,
						WQX_MEASURE_VALUE)));
		COLUMN_POSITION.put(KEY_DETECTION_LIMIT_UNIT,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_LAB_INFO,
						WQX_DETECTION_LIMIT,
						WQX_DETECTION_LIMIT_VALUE,
						WQX_MEASURE_UNIT)));
		COLUMN_POSITION.put(KEY_DETECTION_LIMIT_DESC,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_LAB_INFO,
						WQX_DETECTION_LIMIT,
						WQX_DETECTION_LIMIT_TYPE)));

		COLUMN_POSITION.put(KEY_RES_LAB_ACCRED_YN,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_LAB_INFO,
						WQX_LAB_ACCREDITATION_INDICATOR)));
		COLUMN_POSITION.put(KEY_RES_LAB_ACCRED_AUTHORITY,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_LAB_INFO,
						WQX_LAB_ACCREDITATION_AUTHORITY)));
		COLUMN_POSITION.put(KEY_RES_TAXONOMIST_ACCRED_YN,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_LAB_INFO,
						WQX_TAXONOMIST_ACCREDITATION_INDICATOR)));
		COLUMN_POSITION.put(KEY_RES_TAXONOMIST_ACCRED_AUTHORTY,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_LAB_INFO,
						WQX_TAXONOMIST_ACCREDITATION_AUTHORTY)));

		COLUMN_POSITION.put(KEY_PREP_METHOD_ID,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_LAB_SAMPLE_PREP,
						WQX_LAB_SAMPLE_PREP_METHOD,
						WQX_METHOD_ID)));
		COLUMN_POSITION.put(KEY_PREP_METHOD_CONTEXT,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_LAB_SAMPLE_PREP,
						WQX_LAB_SAMPLE_PREP_METHOD,
						WQX_METHOD_CONTEXT)));
		COLUMN_POSITION.put(KEY_PREP_METHOD_NAME,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_LAB_SAMPLE_PREP,
						WQX_LAB_SAMPLE_PREP_METHOD,
						WQX_METHOD_NAME)));
		COLUMN_POSITION.put(KEY_PREP_METHOD_QUAL_TYPE,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_LAB_SAMPLE_PREP,
						WQX_LAB_SAMPLE_PREP_METHOD,
						WQX_METHOD_QUALIFIER_TYPE)));
		COLUMN_POSITION.put(KEY_PREP_METHOD_DESC,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_LAB_SAMPLE_PREP,
						WQX_LAB_SAMPLE_PREP_METHOD,
						WQX_METHOD_DESCRIPTION)));

		COLUMN_POSITION.put(KEY_ANALYSIS_PREP_DATE_TX,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_LAB_SAMPLE_PREP,
						WQX_PREP_START_DATE)));

		COLUMN_POSITION.put(KEY_PREP_START_TIME,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_LAB_SAMPLE_PREP,
						WQX_PREP_START_TIME,
						WQX_TIME)));
		COLUMN_POSITION.put(KEY_PREP_START_TIMEZONE,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_LAB_SAMPLE_PREP,
						WQX_PREP_START_TIME,
						WQX_TIME_ZONE)));
		COLUMN_POSITION.put(KEY_PREP_END_DATE,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_LAB_SAMPLE_PREP,
						WQX_PREP_END_DATE)));
		COLUMN_POSITION.put(KEY_PREP_END_TIME,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_LAB_SAMPLE_PREP,
						WQX_PREP_END_TIME,
						WQX_TIME)));
		COLUMN_POSITION.put(KEY_PREP_END_TIMEZONE,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_LAB_SAMPLE_PREP,
						WQX_PREP_END_TIME,
						WQX_TIME_ZONE)));
		COLUMN_POSITION.put(KEY_PREP_DILUTION_FACTOR,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_LAB_SAMPLE_PREP,
						WQX_SUBSTITUTION_DILUTION_FACTOR)));
		COLUMN_POSITION.put(KEY_LAB_SAMPLE_PREP_URL,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_LAB_SAMPLE_PREP,
						WQX_LAB_SAMPLE_PREP_URL)));


		COLUMN_POSITION.put(KEY_LAST_UPDATED,
				new LinkedList<String>(Arrays.asList(
						WQX_ACTIVITY,
						WQX_RESULT,
						WQX_LAST_UPDATED)));
	}

	static {
		GROUPING.putAll(ActivityWqx.GROUPING);
		GROUPING.put(KEY_RESULT_ID,
				new LinkedList<ColumnProfile>(Arrays.asList(
						EXTERNAL_RESULT_ID,
						RES_DATA_LOGGER_LINE,
						RESULT_DETECTION_CONDITION_TX,
						CHARACTERISTIC_NAME,

						//Note that "SPECIATION" is correct and "SPECIFICATION" is a typo.
						METHOD_SPECIATION_NAME,
						METHOD_SPECIFICATION_NAME,

						SAMPLE_FRACTION_TYPE,
						RESULT_MEASURE_VALUE,
						RESULT_UNIT,
						RESULT_MEAS_QUAL_CODE,
						RESULT_VALUE_STATUS,
						STATISTIC_TYPE,
						RESULT_VALUE_TYPE,
						WEIGHT_BASIS_TYPE,
						DURATION_BASIS,
						TEMPERATURE_BASIS_LEVEL,
						PARTICLE_SIZE,

						//Note that later profiles specify the "DataQuality" prefix (RES_MEASURE_BIAS always had it)
						PRECISION,
						DQ_PRECISION,
						RES_MEASURE_BIAS,
						RES_MEASURE_CONF_INTERVAL,
						DQ_RES_MEASURE_CONF_INTERVAL,
						RES_MEASURE_UPPER_CONF_LIMIT,
						DQ_RES_MEASURE_UPPER_CONF_LIMIT,
						RES_MEASURE_LOWER_CONF_LIMIT,
						DQ_RES_MEASURE_LOWER_CONF_LIMIT,

						RESULT_COMMENT,
						P_CODE,
						RESULT_DEPTH_MEAS_VALUE,
						RESULT_DEPTH_MEAS_UNIT_CODE,
						RESULT_DEPTH_ALT_REF_PT_TXT,
						RES_SAMPLING_POINT_NAME,
						BIOLOGICAL_INTENT,
						RES_BIO_INDIVIDUAL_ID,
						SAMPLE_TISSUE_TAXONOMIC_NAME,
						UNIDENTIFIEDSPECIESIDENTIFIER,
						SAMPLE_TISSUE_ANATOMY_NAME,
						RES_GROUP_SUMMARY_CT_WT,
						RES_GROUP_SUMMARY_CT_WT_UNIT,
						CELL_FORM_NAME,
						CELL_SHAPE_NAME,
						HABIT_NAME,
						VOLT_NAME,
						RTDET_POLLUTION_TOLERANCE,
						RTDET_POLLUTION_TOLERNCE_SCALE,
						RTDET_TROPHIC_LEVEL,
						RTFGRP_FUNCTIONAL_FEEDING_GRP,
						TAXON_CITATION_TITLE,
						TAXON_CITATION_CREATOR,
						TAXON_CITATION_SUBJECT,
						TAXON_CITATION_PUBLISHER,
						TAXON_CITATION_DATE,
						TAXON_CITATION_ID,
						FCDSC_URL,
						FCDSC_NAME,
						FREQUENCY_CLASS_UNIT,
						FCDSC_LOWER_BOUND,
						FCDSC_UPPER_BOUND,
						RESULT_OBJECT_NAME,
						RESULT_OBJECT_NAME,
						RESULT_FILE_URL,
						ANALYTICAL_PROCEDURE_ID,
						ANALYTICAL_PROCEDURE_SOURCE,
						ANALYTICAL_METHOD_NAME,
						ANLMTH_QUAL_TYPE,


						//Note that later profiles specify the "ResultAnalyticalMethod" prefix
						ANALYTICAL_METHOD_CITATION,
						R_ANALYTICAL_METHOD_CITATION,

						METHOD_URL,
						LAB_NAME,
						ANALYSIS_START_DATE,
						ANALYSIS_START_TIME,
						ANALYSIS_START_TIMEZONE,
						ANALYSIS_END_DATE,
						ANALYSIS_END_TIME,
						ANALYSIS_END_TIMEZONE,
						RLCOM_CD,
						LAB_REMARK,
						RES_DETECT_QNT_LMT_URL,
						DETECTION_LIMIT_DESC,
						DETECTION_LIMIT,
						DETECTION_LIMIT_UNIT,
						RES_LAB_ACCRED_YN,
						RES_LAB_ACCRED_AUTHORITY,
						RES_TAXONOMIST_ACCRED_YN,
						RES_TAXONOMIST_ACCRED_AUTHORTY,
						PREP_METHOD_ID,
						PREP_METHOD_CONTEXT,
						PREP_METHOD_NAME,
						PREP_METHOD_QUAL_TYPE,
						PREP_METHOD_DESC,
						ANALYSIS_PREP_DATE_TX,
						PREP_START_TIME,
						PREP_START_TIMEZONE,
						PREP_END_DATE,
						PREP_END_TIME,
						PREP_END_TIMEZONE,
						PREP_DILUTION_FACTOR,
						LAB_SAMPLE_PREP_URL,
						LAST_UPDATED
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
