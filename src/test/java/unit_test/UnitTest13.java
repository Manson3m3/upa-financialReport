package unit_test;

import constant.Constant;
import load.DataProcessor;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import utils.LogUtil;
import validator.BaseSalaryValidator;
import validator.BaseSocialSecurityValidator;
import validator.MappingOAValidator;
import validator.WorkHoursMonthValidator;

import java.util.logging.Logger;

/**
 * Created by Tao.Jiang on 2017/11/21.
 */
public class UnitTest13 {
    private static final Logger logger = LogUtil.setLoggerHanlder(Logger.getLogger(LogUtil.MY_LOGGER), LogUtil.OUTPUTPATH);

    @Before
    public void before() {

    }

    @After
    public void after() {

    }

    @Test
    public void unitTest13() {
        logger.info("正在测试第13个测试文件\n\n\n\n");
        Constant.JsonPath.JSONPATH = "./file" + "/configs" + "/config13.json";
        boolean[] actuals = new boolean[4];
        actuals[0] = BaseSalaryValidator.isLegal(DataProcessor.baseSalaryList);
        actuals[1] = BaseSocialSecurityValidator.isLegal(DataProcessor.baseSocialSecurityData);
        actuals[2] = MappingOAValidator.isLegal(DataProcessor.mappingOAList);
        actuals[3] = WorkHoursMonthValidator.isLegal();
        boolean[] expect = {true, true, false, false};
        Assert.assertArrayEquals(expect, actuals);
        logger.info("第13个测试文件测试完毕\n\n\n\n");
    }
}

