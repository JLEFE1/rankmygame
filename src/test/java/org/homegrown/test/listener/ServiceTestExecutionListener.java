package org.homegrown.test.listener;

import org.dbunit.IDatabaseTester;
import org.dbunit.dataset.IDataSet;
import org.dbunit.util.fileloader.XlsDataFileLoader;
import org.homegrown.test.annotation.DataSets;
import org.springframework.test.context.TestContext;
import org.springframework.test.context.TestExecutionListener;

/**
 * Created by JoLe on 05/05/15.
 */
public class ServiceTestExecutionListener implements TestExecutionListener {

    private IDatabaseTester databaseTester;

    @Override
    public void beforeTestClass(TestContext testContext) throws Exception {

    }

    @Override
    public void prepareTestInstance(TestContext testContext) throws Exception {

    }

    @Override
    public void beforeTestMethod(TestContext testContext) throws Exception {
        DataSets dataSetAnnotation = testContext.getTestMethod().getAnnotation(DataSets.class);

        if (dataSetAnnotation == null){
            return;
        }

        String dataSetName = dataSetAnnotation.setUpDataSet();

        if (!"".equals(dataSetName)){
            databaseTester = (IDatabaseTester) testContext.getApplicationContext().getBean("databaseTester");
            XlsDataFileLoader xlsDataFileLoader = (XlsDataFileLoader) testContext.getApplicationContext().getBean("xlsDataFileLoader");
            IDataSet dataSet = xlsDataFileLoader.load(dataSetName);

            databaseTester.setDataSet(dataSet);
            databaseTester.onSetup();
        }
    }

    @Override
    public void afterTestMethod(TestContext testContext) throws Exception {
        if (databaseTester != null){
            databaseTester.onTearDown();
        }
    }

    @Override
    public void afterTestClass(TestContext testContext) throws Exception {

    }
}
