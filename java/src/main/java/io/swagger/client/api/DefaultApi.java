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

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.TransferData;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultApi {
    private ApiClient apiClient;

    public DefaultApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DefaultApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for transferdataKeyGet
     * @param key  (required)
     * @param callingSystem set to &#x60;engage&#x60; when calling the &#x60;GET&#x60; or &#x60;POST&#x60; methods from _Pure Engage_/_Premise_, and &#x60;cloud&#x60; when calling from _Pure Cloud_. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call transferdataKeyGetCall(String key, String callingSystem, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/transferdata/{key}"
            .replaceAll("\\{" + "key" + "\\}", apiClient.escapeString(key.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (callingSystem != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("callingSystem", callingSystem));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call transferdataKeyGetValidateBeforeCall(String key, String callingSystem, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'key' is set
        if (key == null) {
            throw new ApiException("Missing the required parameter 'key' when calling transferdataKeyGet(Async)");
        }
        // verify the required parameter 'callingSystem' is set
        if (callingSystem == null) {
            throw new ApiException("Missing the required parameter 'callingSystem' when calling transferdataKeyGet(Async)");
        }
        
        com.squareup.okhttp.Call call = transferdataKeyGetCall(key, callingSystem, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * retrieve transfer data for a given id, and deletes the data from the server.
     * 
     * @param key  (required)
     * @param callingSystem set to &#x60;engage&#x60; when calling the &#x60;GET&#x60; or &#x60;POST&#x60; methods from _Pure Engage_/_Premise_, and &#x60;cloud&#x60; when calling from _Pure Cloud_. (required)
     * @return TransferData
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TransferData transferdataKeyGet(String key, String callingSystem) throws ApiException {
        ApiResponse<TransferData> resp = transferdataKeyGetWithHttpInfo(key, callingSystem);
        return resp.getData();
    }

    /**
     * retrieve transfer data for a given id, and deletes the data from the server.
     * 
     * @param key  (required)
     * @param callingSystem set to &#x60;engage&#x60; when calling the &#x60;GET&#x60; or &#x60;POST&#x60; methods from _Pure Engage_/_Premise_, and &#x60;cloud&#x60; when calling from _Pure Cloud_. (required)
     * @return ApiResponse&lt;TransferData&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TransferData> transferdataKeyGetWithHttpInfo(String key, String callingSystem) throws ApiException {
        com.squareup.okhttp.Call call = transferdataKeyGetValidateBeforeCall(key, callingSystem, null, null);
        Type localVarReturnType = new TypeToken<TransferData>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * retrieve transfer data for a given id, and deletes the data from the server. (asynchronously)
     * 
     * @param key  (required)
     * @param callingSystem set to &#x60;engage&#x60; when calling the &#x60;GET&#x60; or &#x60;POST&#x60; methods from _Pure Engage_/_Premise_, and &#x60;cloud&#x60; when calling from _Pure Cloud_. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call transferdataKeyGetAsync(String key, String callingSystem, final ApiCallback<TransferData> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = transferdataKeyGetValidateBeforeCall(key, callingSystem, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TransferData>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for transferdataKeyPost
     * @param callingSystem set to &#x60;engage&#x60; when calling the &#x60;GET&#x60; or &#x60;POST&#x60; methods from _Pure Engage_/_Premise_, and &#x60;cloud&#x60; when calling from _Pure Cloud_. (required)
     * @param key  (required)
     * @param body Transfer data to be saved on server (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call transferdataKeyPostCall(String callingSystem, String key, TransferData body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/transferdata/{key}"
            .replaceAll("\\{" + "key" + "\\}", apiClient.escapeString(key.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (callingSystem != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("callingSystem", callingSystem));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call transferdataKeyPostValidateBeforeCall(String callingSystem, String key, TransferData body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'callingSystem' is set
        if (callingSystem == null) {
            throw new ApiException("Missing the required parameter 'callingSystem' when calling transferdataKeyPost(Async)");
        }
        // verify the required parameter 'key' is set
        if (key == null) {
            throw new ApiException("Missing the required parameter 'key' when calling transferdataKeyPost(Async)");
        }
        
        com.squareup.okhttp.Call call = transferdataKeyPostCall(callingSystem, key, body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * posts transfer data for a given id. Data expires after five minutes, or after a &#x60;GET&#x60; retrieves the data, whichever comes first.
     * 
     * @param callingSystem set to &#x60;engage&#x60; when calling the &#x60;GET&#x60; or &#x60;POST&#x60; methods from _Pure Engage_/_Premise_, and &#x60;cloud&#x60; when calling from _Pure Cloud_. (required)
     * @param key  (required)
     * @param body Transfer data to be saved on server (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void transferdataKeyPost(String callingSystem, String key, TransferData body) throws ApiException {
        transferdataKeyPostWithHttpInfo(callingSystem, key, body);
    }

    /**
     * posts transfer data for a given id. Data expires after five minutes, or after a &#x60;GET&#x60; retrieves the data, whichever comes first.
     * 
     * @param callingSystem set to &#x60;engage&#x60; when calling the &#x60;GET&#x60; or &#x60;POST&#x60; methods from _Pure Engage_/_Premise_, and &#x60;cloud&#x60; when calling from _Pure Cloud_. (required)
     * @param key  (required)
     * @param body Transfer data to be saved on server (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> transferdataKeyPostWithHttpInfo(String callingSystem, String key, TransferData body) throws ApiException {
        com.squareup.okhttp.Call call = transferdataKeyPostValidateBeforeCall(callingSystem, key, body, null, null);
        return apiClient.execute(call);
    }

    /**
     * posts transfer data for a given id. Data expires after five minutes, or after a &#x60;GET&#x60; retrieves the data, whichever comes first. (asynchronously)
     * 
     * @param callingSystem set to &#x60;engage&#x60; when calling the &#x60;GET&#x60; or &#x60;POST&#x60; methods from _Pure Engage_/_Premise_, and &#x60;cloud&#x60; when calling from _Pure Cloud_. (required)
     * @param key  (required)
     * @param body Transfer data to be saved on server (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call transferdataKeyPostAsync(String callingSystem, String key, TransferData body, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = transferdataKeyPostValidateBeforeCall(callingSystem, key, body, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
