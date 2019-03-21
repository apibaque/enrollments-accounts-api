/*
 * Api Documentation
 * Api Documentation
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.enrollment.api;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import io.swagger.client.enrollment.ApiCallback;
import io.swagger.client.enrollment.ApiClient;
import io.swagger.client.enrollment.ApiException;
import io.swagger.client.enrollment.ApiResponse;
import io.swagger.client.enrollment.Configuration;
import io.swagger.client.enrollment.Pair;
import io.swagger.client.enrollment.ProgressRequestBody;
import io.swagger.client.enrollment.ProgressResponseBody;
import io.swagger.client.enrollment.model.EnrollmentAccountsDto;
import io.swagger.client.enrollment.model.EnrollmentAccountsResponseDto;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnrollmentAccountsControllerApi {
    private ApiClient apiClient;

    public EnrollmentAccountsControllerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public EnrollmentAccountsControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for addEnrollmentAccountsUsingPOST
     * @param body body (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addEnrollmentAccountsUsingPOSTCall(EnrollmentAccountsDto body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/enrollments";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "*/*"
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
    private com.squareup.okhttp.Call addEnrollmentAccountsUsingPOSTValidateBeforeCall(EnrollmentAccountsDto body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling addEnrollmentAccountsUsingPOST(Async)");
        }
        

        com.squareup.okhttp.Call call = addEnrollmentAccountsUsingPOSTCall(body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * addEnrollmentAccounts
     * 
     * @param body body (required)
     * @return EnrollmentAccountsResponseDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public EnrollmentAccountsResponseDto addEnrollmentAccountsUsingPOST(EnrollmentAccountsDto body) throws ApiException {
        ApiResponse<EnrollmentAccountsResponseDto> resp = addEnrollmentAccountsUsingPOSTWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * addEnrollmentAccounts
     * 
     * @param body body (required)
     * @return ApiResponse&lt;EnrollmentAccountsResponseDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<EnrollmentAccountsResponseDto> addEnrollmentAccountsUsingPOSTWithHttpInfo(EnrollmentAccountsDto body) throws ApiException {
        com.squareup.okhttp.Call call = addEnrollmentAccountsUsingPOSTValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<EnrollmentAccountsResponseDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * addEnrollmentAccounts (asynchronously)
     * 
     * @param body body (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addEnrollmentAccountsUsingPOSTAsync(EnrollmentAccountsDto body, final ApiCallback<EnrollmentAccountsResponseDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addEnrollmentAccountsUsingPOSTValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<EnrollmentAccountsResponseDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getEnrollmentAccountsUsingGET
     * @param id id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getEnrollmentAccountsUsingGETCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/enrollments/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "*/*"
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
    private com.squareup.okhttp.Call getEnrollmentAccountsUsingGETValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getEnrollmentAccountsUsingGET(Async)");
        }
        

        com.squareup.okhttp.Call call = getEnrollmentAccountsUsingGETCall(id, progressListener, progressRequestListener);
        return call;

    }

    /**
     * getEnrollmentAccounts
     * 
     * @param id id (required)
     * @return EnrollmentAccountsResponseDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public EnrollmentAccountsResponseDto getEnrollmentAccountsUsingGET(String id) throws ApiException {
        ApiResponse<EnrollmentAccountsResponseDto> resp = getEnrollmentAccountsUsingGETWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * getEnrollmentAccounts
     * 
     * @param id id (required)
     * @return ApiResponse&lt;EnrollmentAccountsResponseDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<EnrollmentAccountsResponseDto> getEnrollmentAccountsUsingGETWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = getEnrollmentAccountsUsingGETValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<EnrollmentAccountsResponseDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * getEnrollmentAccounts (asynchronously)
     * 
     * @param id id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getEnrollmentAccountsUsingGETAsync(String id, final ApiCallback<EnrollmentAccountsResponseDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getEnrollmentAccountsUsingGETValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<EnrollmentAccountsResponseDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}