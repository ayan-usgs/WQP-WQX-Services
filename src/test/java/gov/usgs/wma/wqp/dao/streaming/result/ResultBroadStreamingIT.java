package gov.usgs.wma.wqp.dao.streaming.result;

import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import com.github.springtestdbunit.annotation.DatabaseSetup;
import com.github.springtestdbunit.annotation.DbUnitConfiguration;

import gov.usgs.wma.wqp.CsvDataSetLoader;
import gov.usgs.wma.wqp.dao.NameSpace;
import gov.usgs.wma.wqp.dao.StreamingDao;
import gov.usgs.wma.wqp.mapping.TestResultMap;
import gov.usgs.wma.wqp.springinit.DBTestConfig;

@SpringBootTest(webEnvironment=WebEnvironment.NONE,
classes={DBTestConfig.class, StreamingDao.class})
@DatabaseSetup("classpath:/testData/csv/")
@DbUnitConfiguration(dataSetLoader = CsvDataSetLoader.class)
public class ResultBroadStreamingIT  extends BaseResultStreamingTest {

	protected NameSpace nameSpace = NameSpace.RESULT_BROAD;
	protected Map<String, Object> expectedMap = TestResultMap.RESULT_BROAD;

	@Test
	public void testHarness() {
		activityTest(nameSpace);
		analyticalMethodTest(nameSpace);
		assemblageTest(nameSpace);
		avoidTest(nameSpace);
		bboxTest(nameSpace);
		characteristicNameTest(nameSpace);
		characteristicTypeTest(nameSpace);
		countryTest(nameSpace);
		countyTest(nameSpace);
		emptyParameterTest(nameSpace);
		huc2Test(nameSpace);
		huc3Test(nameSpace);
		huc4Test(nameSpace);
		huc5Test(nameSpace);
		huc6Test(nameSpace);
		huc7Test(nameSpace);
		huc8Test(nameSpace);
		huc10Test(nameSpace);
		huc12Test(nameSpace);
		mimeTypeTest(nameSpace);
		minActivitiesTest(nameSpace);
		minResultsTest(nameSpace);
		nldiSitesTest(nameSpace);
		nldiUrlTest(nameSpace);
		nullParameterTest(nameSpace);
		organizationTest(nameSpace);
		pcodeTest(nameSpace);
		projectTest(nameSpace);
		providersTest(nameSpace);
		resultTest(nameSpace);
		sampleMediaTest(nameSpace);
		siteIdTest(nameSpace);
		siteIdLargeListTest(nameSpace);
		siteTypeTest(nameSpace);
		siteUrlBaseTest(nameSpace);
		sortedTest(nameSpace, expectedMap);
		startDateHiTest(nameSpace);
		startDateLoTest(nameSpace);
		stateTest(nameSpace);
		subjectTaxonomicNameTest(nameSpace);
		withinTest(nameSpace);
		zipTest(nameSpace);
		multipleParameterResultTest(nameSpace);
	}

	@Override
	protected void assertSiteUrlBase(Map<String, Object> row) {
		assertResDetectQntLmtUrl(row);
		assertLabSamplePrepUrl(row);
		assertResultFileUrl(row);
	}

}
