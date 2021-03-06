package gov.usgs.wma.wqp.dao.count;

import com.github.springtestdbunit.annotation.DatabaseSetup;
import com.github.springtestdbunit.annotation.DbUnitConfiguration;
import gov.usgs.wma.wqp.CsvDataSetLoader;
import gov.usgs.wma.wqp.dao.CountDao;
import gov.usgs.wma.wqp.dao.NameSpace;
import gov.usgs.wma.wqp.mapping.CountColumn;
import gov.usgs.wma.wqp.parameter.FilterParameters;
import gov.usgs.wma.wqp.springinit.DBTestConfig;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment=SpringBootTest.WebEnvironment.NONE,
	classes={DBTestConfig.class, CountDao.class})
@DatabaseSetup("classpath:/testData/csv/")
@DbUnitConfiguration(dataSetLoader = CsvDataSetLoader.class)
public class CountDaoBiologicalMetricIT extends BaseCountDaoTest {

	@Test
	public void testHarness() {
		activityTest();
		analyticalMethodTest();
		assemblageTest();
		avoidTest();
		bboxTest();
		characteristicNameTest();
		characteristicTypeTest();
		countryTest();
		countyTest();
		emptyParameterTest();
		huc2Test();
		huc3Test();
		huc4Test();
		huc5Test();
		huc6Test();
		huc7Test();
		huc8Test();
		huc10Test();
		huc12Test();
		mimeTypeTest();
		minActivitiesTest();
		minResultsTest();
		nldiSitesTest();
		nldiUrlTest();
		nullParameterTest();
		organizationTest();
		pcodeTest();
		projectTest();
		providersTest();
		resultTest();
		sampleMediaTest();
		siteIdTest();
		siteIdLargeListTest();
		siteTypeTest();
		siteUrlBaseTest();
		sortedTest();
		startDateHiTest();
		startDateLoTest();
		stateTest();
		subjectTaxonomicNameTest();
		withinTest();
		zipTest();
		multipleParameterActivitySumTest();
		multipleParameterActivitySumStationSumTest();		
		multipleParameterResultSumTest();	
	}

	public void activityTest() {
		List<Map<String, Object>> counts = activityTest(NameSpace.BIOLOGICAL_METRIC, BASE_HEADER_COUNT);
		assertFullDbReturned(counts);
	}

	public void analyticalMethodTest() {
		List<Map<String, Object>> counts = analyticalMethodTest(NameSpace.BIOLOGICAL_METRIC, 3);
		assertResults(counts, CountColumn.KEY_BIOLOGICAL_METRIC_COUNT, "5", "1", null, "4");
	}

	public void assemblageTest() {
		List<Map<String, Object>> counts = assemblageTest(NameSpace.BIOLOGICAL_METRIC, 3);
		assertResults(counts, CountColumn.KEY_BIOLOGICAL_METRIC_COUNT, "5", "1", null, "4");
	}

	public void avoidTest() {
		List<Map<String, Object>> counts = avoidTest(NameSpace.BIOLOGICAL_METRIC, 2);
		assertResults(counts, CountColumn.KEY_BIOLOGICAL_METRIC_COUNT, "7", null, null, "7");
	}

	public void bboxTest() {
		List<Map<String, Object>> counts = bboxTest(NameSpace.BIOLOGICAL_METRIC, 4);
		assertResults(counts, CountColumn.KEY_BIOLOGICAL_METRIC_COUNT, "9", "2", "2", "5");
	}

	public void characteristicNameTest() {
		List<Map<String, Object>> counts = characteristicNameTest(NameSpace.BIOLOGICAL_METRIC, 2);
		assertResults(counts, CountColumn.KEY_BIOLOGICAL_METRIC_COUNT, "4", null, null, "4");
	}

	public void characteristicTypeTest() {
		List<Map<String, Object>> counts = characteristicTypeTest(NameSpace.BIOLOGICAL_METRIC, 3);
		assertResults(counts, CountColumn.KEY_BIOLOGICAL_METRIC_COUNT, "5", null, "1", "4");
	}

	public void countryTest() {
		List<Map<String, Object>> counts = countryTest(NameSpace.BIOLOGICAL_METRIC, BASE_HEADER_COUNT);
		assertResults(counts, CountColumn.KEY_BIOLOGICAL_METRIC_COUNT, "11", "3", "2", "6");
	}

	public void countyTest() {
		List<Map<String, Object>> counts = countyTest(NameSpace.BIOLOGICAL_METRIC, BASE_HEADER_COUNT);
		assertResults(counts, CountColumn.KEY_BIOLOGICAL_METRIC_COUNT, "10", "2", "2", "6");
	}

	public void emptyParameterTest() {
		List<Map<String, Object>> counts = emptyParameterTest(NameSpace.BIOLOGICAL_METRIC, BASE_HEADER_COUNT);
		assertFullDbReturned(counts);
	}

	public void huc2Test() {
		List<Map<String, Object>> counts = huc2Test(NameSpace.BIOLOGICAL_METRIC, BASE_HEADER_COUNT);
		assertResults(counts, CountColumn.KEY_BIOLOGICAL_METRIC_COUNT, "7", "2", "2", "3");
	}

	public void huc3Test() {
		List<Map<String, Object>> counts = huc3Test(NameSpace.BIOLOGICAL_METRIC,  BASE_HEADER_COUNT);
		assertResults(counts, CountColumn.KEY_BIOLOGICAL_METRIC_COUNT, "7", "2", "2", "3");
	}

	public void huc4Test() {
		List<Map<String, Object>> counts = huc4Test(NameSpace.BIOLOGICAL_METRIC, 3);
		assertResults(counts, CountColumn.KEY_BIOLOGICAL_METRIC_COUNT, "4", "2", null, "2");
	}

	public void huc5Test() {
		List<Map<String, Object>> counts = huc5Test(NameSpace.BIOLOGICAL_METRIC, 3);
		assertResults(counts, CountColumn.KEY_BIOLOGICAL_METRIC_COUNT, "4", "2", null, "2");
	}

	public void huc6Test() {
		List<Map<String, Object>> counts = huc6Test(NameSpace.BIOLOGICAL_METRIC, 3);
		assertResults(counts, CountColumn.KEY_BIOLOGICAL_METRIC_COUNT, "3", "1", null, "2");
	}

	public void huc7Test() {
		List<Map<String, Object>> counts = huc7Test(NameSpace.BIOLOGICAL_METRIC, 3);
		assertResults(counts, CountColumn.KEY_BIOLOGICAL_METRIC_COUNT, "3", "1", null, "2");
	}

	public void huc8Test() {
		List<Map<String, Object>> counts = huc8Test(NameSpace.BIOLOGICAL_METRIC, 2);
		assertResults(counts, CountColumn.KEY_BIOLOGICAL_METRIC_COUNT, "2", null, null, "2");
	}

	public void huc10Test() {
		List<Map<String, Object>> counts = huc10Test(NameSpace.BIOLOGICAL_METRIC, 2);
		assertResults(counts, CountColumn.KEY_BIOLOGICAL_METRIC_COUNT, "2", null, null, "2");
	}

	public void huc12Test() {
		List<Map<String, Object>> counts = huc12Test(NameSpace.BIOLOGICAL_METRIC, 2);
		assertResults(counts, CountColumn.KEY_BIOLOGICAL_METRIC_COUNT, "2", null, null, "2");
	}

	public void mimeTypeTest() {
		List<Map<String, Object>> counts = mimeTypeJsonTest(NameSpace.BIOLOGICAL_METRIC, BASE_HEADER_COUNT);
		assertFullDbReturned(counts);

		counts = mimeTypeGeoJsonTest(NameSpace.BIOLOGICAL_METRIC, BASE_HEADER_COUNT);
		assertFullDbReturned(counts);

		counts = mimeTypeKmlTest(NameSpace.BIOLOGICAL_METRIC, BASE_HEADER_COUNT);
		assertFullDbReturned(counts);

		counts = mimeTypeKmzTest(NameSpace.BIOLOGICAL_METRIC, BASE_HEADER_COUNT);
		assertFullDbReturned(counts);

		counts = mimeTypeCsvTest(NameSpace.BIOLOGICAL_METRIC, BASE_HEADER_COUNT);
		assertFullDbReturned(counts);

		counts = mimeTypeTsvTest(NameSpace.BIOLOGICAL_METRIC, BASE_HEADER_COUNT);
		assertFullDbReturned(counts);

		counts = mimeTypeXmlTest(NameSpace.BIOLOGICAL_METRIC, BASE_HEADER_COUNT);
		assertFullDbReturned(counts);

		counts = mimeTypeXlsxTest(NameSpace.BIOLOGICAL_METRIC, BASE_HEADER_COUNT);
		assertFullDbReturned(counts);
	}

	public void minActivitiesTest() {
		List<Map<String, Object>> counts = minActivitiesTest(NameSpace.BIOLOGICAL_METRIC, BASE_HEADER_COUNT);
		assertResults(counts, CountColumn.KEY_BIOLOGICAL_METRIC_COUNT, "7", "1", "1", "5");
	}

	public void minResultsTest() {
		List<Map<String, Object>> counts = minResultsTest(NameSpace.BIOLOGICAL_METRIC, 3);		
		assertResults(counts, CountColumn.KEY_BIOLOGICAL_METRIC_COUNT, "6", "1", null, "5");
	}

	public void nldiSitesTest() {
		List<Map<String, Object>> counts = nldiSitesTest(NameSpace.BIOLOGICAL_METRIC, 2);
		assertResults(counts, CountColumn.KEY_BIOLOGICAL_METRIC_COUNT, "3", null, null, "3");
	}

	public void nldiUrlTest() {
		List<Map<String, Object>> counts = nldiUrlTest(NameSpace.BIOLOGICAL_METRIC, BASE_HEADER_COUNT);
		assertFullDbReturned(counts);
	}

	public void nullParameterTest() {
		List<Map<String, Object>> counts = nullParameterTest(NameSpace.BIOLOGICAL_METRIC, BASE_HEADER_COUNT);
		assertFullDbReturned(counts);
	}

	public void organizationTest() {
		List<Map<String, Object>> counts = organizationTest(NameSpace.BIOLOGICAL_METRIC, BASE_HEADER_COUNT);
		assertResults(counts, CountColumn.KEY_BIOLOGICAL_METRIC_COUNT, "10", "2", "2", "6");
	}

	public void pcodeTest() {
		List<Map<String, Object>> counts = pcodeTest(NameSpace.BIOLOGICAL_METRIC, 3);
		assertResults(counts, CountColumn.KEY_BIOLOGICAL_METRIC_COUNT, "4", "1", null, "3");
	}

	public void projectTest() {
		List<Map<String, Object>> counts = projectTest(NameSpace.BIOLOGICAL_METRIC, BASE_HEADER_COUNT);
		assertResults(counts, CountColumn.KEY_BIOLOGICAL_METRIC_COUNT, "9", "3", "2", "4");
	}

	public void providersTest() {
		List<Map<String, Object>> counts = providersTest(NameSpace.BIOLOGICAL_METRIC, 3);
		assertResults(counts, CountColumn.KEY_BIOLOGICAL_METRIC_COUNT, "11", "4", null, "7");
	}

	public void resultTest() {
		List<Map<String, Object>> counts = resultTest(NameSpace.BIOLOGICAL_METRIC, BASE_HEADER_COUNT);
		assertFullDbReturned(counts);
	}

	public void sampleMediaTest() {
		List<Map<String, Object>> counts = sampleMediaTest(NameSpace.BIOLOGICAL_METRIC, BASE_HEADER_COUNT);
		assertResults(counts, CountColumn.KEY_BIOLOGICAL_METRIC_COUNT, "11", "3", "2", "6");
	}

	public void siteIdTest() {
		List<Map<String, Object>> counts = siteIdTest(NameSpace.BIOLOGICAL_METRIC, BASE_HEADER_COUNT);
		assertResults(counts, CountColumn.KEY_BIOLOGICAL_METRIC_COUNT, "9", "2", "2", "5");
	}

	public void siteIdLargeListTest() {
		List<Map<String, Object>> counts = siteIdLargeListTest(NameSpace.BIOLOGICAL_METRIC, 2);
		assertResults(counts, CountColumn.KEY_BIOLOGICAL_METRIC_COUNT, "3", null, null, "3");
	}

	public void siteTypeTest() {
		List<Map<String, Object>> counts = siteTypeTest(NameSpace.BIOLOGICAL_METRIC, BASE_HEADER_COUNT);
		assertResults(counts, CountColumn.KEY_BIOLOGICAL_METRIC_COUNT, "11", "2", "2", "7");
	}

	public void siteUrlBaseTest() {
		List<Map<String, Object>> counts = siteUrlBaseTest(NameSpace.BIOLOGICAL_METRIC, BASE_HEADER_COUNT);
		assertFullDbReturned(counts);
	}

	public void sortedTest() {
		List<Map<String, Object>> counts = sortedTest(NameSpace.BIOLOGICAL_METRIC, BASE_HEADER_COUNT);
		assertFullDbReturned(counts);
	}

	public void startDateHiTest() {
		List<Map<String, Object>> counts = startDateHiTest(NameSpace.BIOLOGICAL_METRIC, BASE_HEADER_COUNT);
		assertResults(counts, CountColumn.KEY_BIOLOGICAL_METRIC_COUNT, "11", "3", "2", "6");
	}

	public void startDateLoTest() {
		List<Map<String, Object>> counts = startDateLoTest(NameSpace.BIOLOGICAL_METRIC, BASE_HEADER_COUNT);
		assertResults(counts, CountColumn.KEY_BIOLOGICAL_METRIC_COUNT, "9", "3", "2", "4");
	}

	public void stateTest() {
		List<Map<String, Object>> counts = stateTest(NameSpace.BIOLOGICAL_METRIC, BASE_HEADER_COUNT);
		assertResults(counts, CountColumn.KEY_BIOLOGICAL_METRIC_COUNT, "10", "2", "2", "6");
	}

	public void subjectTaxonomicNameTest() {
		List<Map<String, Object>> counts = subjectTaxonomicNameTest(NameSpace.BIOLOGICAL_METRIC, 3);
		assertResults(counts, CountColumn.KEY_BIOLOGICAL_METRIC_COUNT, "5", "1", null, "4");
	}

	public void withinTest() {
		List<Map<String, Object>> counts = withinTest(NameSpace.BIOLOGICAL_METRIC, BASE_HEADER_COUNT);
		assertResults(counts, CountColumn.KEY_BIOLOGICAL_METRIC_COUNT, "10", "2", "2", "6");
	}

	public void zipTest() {
		List<Map<String, Object>> counts = zipTest(NameSpace.BIOLOGICAL_METRIC, BASE_HEADER_COUNT);
		assertFullDbReturned(counts);
	}

	public void multipleParameterActivitySumTest() {
		FilterParameters filter = new FilterParameters();
		filter.setCommand(getCommand());
		filter.setBBox(getBBox());
		filter.setCountrycode(getCountry());
		filter.setCountycode(getCounty());
		filter.setHuc(getHuc());
		filter.setLat(getLatitude());
		filter.setLong(getLongitude());
		filter.setMinactivities(getMinActivities());
		filter.setMinresults(getMinResults());
		filter.setNldiSites(getNldiSites());
		filter.setOrganization(getOrganization());
		filter.setProviders(getProviders());
		filter.setSiteid(getSiteId());
		filter.setSiteType(getSiteType());
		filter.setStatecode(getState());
		filter.setWithin(getWithin());
		filter.setProject(getProject());
		filter.setSampleMedia(getSampleMedia());
		filter.setStartDateHi(getStartDateHi());
		filter.setStartDateLo(getStartDateLo());
		List<Map<String, Object>> counts = callDao(NameSpace.BIOLOGICAL_METRIC, 2, filter);
		assertResults(counts, CountColumn.KEY_BIOLOGICAL_METRIC_COUNT, "1", null, null, "1");
	}

	public void multipleParameterActivitySumStationSumTest() {
		FilterParameters filter = new FilterParameters();
		filter.setCommand(getCommand());
		filter.setBBox(getBBox());
		filter.setLat(getLatitude());
		filter.setLong(getLongitude());
		filter.setMinactivities(getMinActivities());
		filter.setMinresults(getMinResults());
		filter.setProject(getProject());
		filter.setSampleMedia(getSampleMedia());
		filter.setStartDateHi(getStartDateHi());
		filter.setStartDateLo(getStartDateLo());
		filter.setWithin(getWithin());
		List<Map<String, Object>> counts = callDao(NameSpace.BIOLOGICAL_METRIC, 2, filter);
		assertResults(counts, CountColumn.KEY_BIOLOGICAL_METRIC_COUNT, "2", null, null, "2");
	}

	public void multipleParameterResultSumTest() {
		FilterParameters filter = new FilterParameters();
		filter.setAnalyticalmethod(getAnalyticalMethod());
		filter.setCommand(getCommand());
		filter.setAssemblage(getAssemblage());
		filter.setCharacteristicName(getCharacteristicName());
		filter.setCharacteristicType(getCharacteristicType());
		filter.setCountrycode(getCountry());
		filter.setCountycode(getCounty());
		filter.setHuc(getHuc());
		filter.setMinactivities(getMinActivities());
		filter.setMinresults(getMinResults());
		filter.setNldiSites(getNldiSites());
		filter.setOrganization(getOrganization());
		filter.setPCode(getPcode());
		filter.setProject(getProject());
		filter.setProviders(getProviders());
		filter.setSampleMedia(getSampleMedia());
		filter.setSiteid(getSiteId());
		filter.setSiteType(getSiteType());
		filter.setStatecode(getState());
		filter.setStartDateHi(getStartDateHi());
		filter.setStartDateLo(getStartDateLo());
		filter.setSubjectTaxonomicName(getSubjectTaxonomicName());
		List<Map<String, Object>> counts = callDao(NameSpace.BIOLOGICAL_METRIC, 2, filter);
		assertResults(counts, CountColumn.KEY_BIOLOGICAL_METRIC_COUNT, "2", null, null, "2");
	}

	public void multipleParameterResultSumActivitySumTests() {
		FilterParameters filter = new FilterParameters();
		filter.setAnalyticalmethod(getAnalyticalMethod());
		filter.setCommand(getCommand());
		filter.setAssemblage(getAssemblage());
		filter.setBBox(getBBox());
		filter.setCharacteristicName(getCharacteristicName());
		filter.setCharacteristicType(getCharacteristicType());
		filter.setCountrycode(getCountry());
		filter.setCountycode(getCounty());
		filter.setHuc(getHuc());
		filter.setLat(getLatitude());
		filter.setLong(getLongitude());
		filter.setMinactivities(getMinActivities());
		filter.setMinresults(getMinResults());
		filter.setNldiSites(getNldiSites());
		filter.setOrganization(getOrganization());
		filter.setPCode(getPcode());
		filter.setProject(getProject());
		filter.setProviders(getProviders());
		filter.setSampleMedia(getSampleMedia());
		filter.setSiteid(getSiteId());
		filter.setSiteType(getSiteType());
		filter.setStartDateHi(getStartDateHi());
		filter.setStartDateLo(getStartDateLo());
		filter.setStatecode(getState());
		filter.setSubjectTaxonomicName(getSubjectTaxonomicName());
		filter.setWithin(getWithin());
		List<Map<String, Object>> counts = callDao(NameSpace.BIOLOGICAL_METRIC, 2, filter);
		assertResults(counts, CountColumn.KEY_BIOLOGICAL_METRIC_COUNT, "1", null, null, "1");
	}

	protected void assertFullDbReturned(List<Map<String, Object>> counts) {
		assertResults(counts, CountColumn.KEY_BIOLOGICAL_METRIC_COUNT, TOTAL_BIOLOGICAL_METRIC_COUNT, NWIS_BIOLOGICAL_METRIC_COUNT, STEWARDS_BIOLOGICAL_METRIC_COUNT, STORET_BIOLOGICAL_METRIC_COUNT);
	}
}
