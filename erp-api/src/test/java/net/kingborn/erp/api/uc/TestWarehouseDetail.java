package net.kingborn.erp.api.uc;

import net.kingborn.erp.api.TestUtil;
import net.kingborn.test.BaseUrl;
import net.kingborn.test.TestCommand;
import org.junit.Test;

/**
 * 获取仓库详情
 */
public class TestWarehouseDetail extends TestCommand {

    @Override
    public void init() throws Exception {
        headerMap = TestUtil.getAuthHeader();

        postParamsMap.put("warehouseId", "1295255360361324545");
    }

    @Test
    @Override
    public void doTest() {
        System.out.println(formatJson(doPost()));
    }

    @Override
    protected BaseUrl getBaseUrl() {
        return new BaseUrl("localhost", 9090, "/warehouse/detail");
    }
}
