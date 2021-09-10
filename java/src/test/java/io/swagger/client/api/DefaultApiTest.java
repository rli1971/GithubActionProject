/*
 * Genesys Transfer Data
 * API for storing/retrieving transfer data.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.TransferData;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
@Ignore
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    /**
     * retrieve transfer data for a given id, and deletes the data from the server.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void transferdataKeyGetTest() throws ApiException {
        String key = null;
        String callingSystem = null;
        TransferData response = api.transferdataKeyGet(key, callingSystem);

        // TODO: test validations
    }
    /**
     * posts transfer data for a given id. Data expires after five minutes, or after a &#x60;GET&#x60; retrieves the data, whichever comes first.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void transferdataKeyPostTest() throws ApiException {
        String callingSystem = null;
        String key = null;
        TransferData body = null;
        api.transferdataKeyPost(callingSystem, key, body);

        // TODO: test validations
    }
}
