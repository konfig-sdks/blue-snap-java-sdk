/*
 * API Settings
 * At BlueSnap, we look at payments a little differently. Our Payment Orchestration Platform helps businesses accept payments globally and is designed to increase revenue and reduces costs. We provide a comprehensive back-end solutions that simplifies the complexity of payments, managing the full process from start to finish.  BlueSnap supports payments through multiple sales channels such as online and mobile sales, marketplaces, subscriptions, invoice payments and manual orders through a virtual terminal. And for businesses looking for embedded payments, we offer white-labeled payments for platforms with automated underwriting and onboarding that supports marketplaces and split payments.  And with one integration and contract, businesses can sell in over 200 geographies with access to local acquiring in 47 countries, 110+ currencies and 100+ global payment types, including popular eWallets, automated accounts receivable, world-class fraud protection and chargeback management, built-in solutions for regulation and tax compliance, and unified global reporting to help businesses grow.  With a US headquarters in Waltham, MA, and EU headquarters in Dublin, Ireland, BlueSnap is backed by world-class private equity investors including Great Hill Partners and Parthenon Capital Partners.   Learn more at BlueSnap.com
 *
 * The version of the OpenAPI document: 8976-Tools
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.ShopperCreateVaultedShopperRequest;
import com.konfigthis.client.model.ShopperCreateVaultedShopperRequestPaymentSources;
import com.konfigthis.client.model.ShopperUpdateVaultedShopperRequest;
import com.konfigthis.client.model.ShopperUpdateVaultedShopperRequestPaymentSources;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ShopperApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ShopperApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public ShopperApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        if (apiClient.getSec1() == null) {
            throw new IllegalArgumentException("\"Authorization\" is required but no API key was provided. Please set \"Authorization\" with ApiClient#setSec1(String).");
        }
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call createVaultedShopperCall(ShopperCreateVaultedShopperRequest shopperCreateVaultedShopperRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = shopperCreateVaultedShopperRequest;

        // create path and map variables
        String localVarPath = "/vaulted-shoppers";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "sec0", "sec1" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createVaultedShopperValidateBeforeCall(ShopperCreateVaultedShopperRequest shopperCreateVaultedShopperRequest, final ApiCallback _callback) throws ApiException {
        return createVaultedShopperCall(shopperCreateVaultedShopperRequest, _callback);

    }


    private ApiResponse<Void> createVaultedShopperWithHttpInfo(ShopperCreateVaultedShopperRequest shopperCreateVaultedShopperRequest) throws ApiException {
        okhttp3.Call localVarCall = createVaultedShopperValidateBeforeCall(shopperCreateVaultedShopperRequest, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call createVaultedShopperAsync(ShopperCreateVaultedShopperRequest shopperCreateVaultedShopperRequest, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = createVaultedShopperValidateBeforeCall(shopperCreateVaultedShopperRequest, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class CreateVaultedShopperRequestBuilder {
        private ShopperCreateVaultedShopperRequestPaymentSources paymentSources;
        private String firstName;
        private String lastName;

        private CreateVaultedShopperRequestBuilder() {
        }

        /**
         * Set paymentSources
         * @param paymentSources  (optional)
         * @return CreateVaultedShopperRequestBuilder
         */
        public CreateVaultedShopperRequestBuilder paymentSources(ShopperCreateVaultedShopperRequestPaymentSources paymentSources) {
            this.paymentSources = paymentSources;
            return this;
        }
        
        /**
         * Set firstName
         * @param firstName  (optional, default to FirstName)
         * @return CreateVaultedShopperRequestBuilder
         */
        public CreateVaultedShopperRequestBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        
        /**
         * Set lastName
         * @param lastName  (optional, default to LastName)
         * @return CreateVaultedShopperRequestBuilder
         */
        public CreateVaultedShopperRequestBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        
        /**
         * Build call for createVaultedShopper
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            ShopperCreateVaultedShopperRequest shopperCreateVaultedShopperRequest = buildBodyParams();
            return createVaultedShopperCall(shopperCreateVaultedShopperRequest, _callback);
        }

        private ShopperCreateVaultedShopperRequest buildBodyParams() {
            ShopperCreateVaultedShopperRequest shopperCreateVaultedShopperRequest = new ShopperCreateVaultedShopperRequest();
            shopperCreateVaultedShopperRequest.paymentSources(this.paymentSources);
            shopperCreateVaultedShopperRequest.firstName(this.firstName);
            shopperCreateVaultedShopperRequest.lastName(this.lastName);
            return shopperCreateVaultedShopperRequest;
        }

        /**
         * Execute createVaultedShopper request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            ShopperCreateVaultedShopperRequest shopperCreateVaultedShopperRequest = buildBodyParams();
            createVaultedShopperWithHttpInfo(shopperCreateVaultedShopperRequest);
        }

        /**
         * Execute createVaultedShopper request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            ShopperCreateVaultedShopperRequest shopperCreateVaultedShopperRequest = buildBodyParams();
            return createVaultedShopperWithHttpInfo(shopperCreateVaultedShopperRequest);
        }

        /**
         * Execute createVaultedShopper request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            ShopperCreateVaultedShopperRequest shopperCreateVaultedShopperRequest = buildBodyParams();
            return createVaultedShopperAsync(shopperCreateVaultedShopperRequest, _callback);
        }
    }

    /**
     * Create Vaulted Shopper
     * 
     * @return CreateVaultedShopperRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CreateVaultedShopperRequestBuilder createVaultedShopper() throws IllegalArgumentException {
        return new CreateVaultedShopperRequestBuilder();
    }
    private okhttp3.Call deleteVaultedShopperCall(String vaultedShopperId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/vaulted-shoppers/{vaultedShopperId}"
            .replace("{" + "vaultedShopperId" + "}", localVarApiClient.escapeString(vaultedShopperId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "sec0", "sec1" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteVaultedShopperValidateBeforeCall(String vaultedShopperId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'vaultedShopperId' is set
        if (vaultedShopperId == null) {
            throw new ApiException("Missing the required parameter 'vaultedShopperId' when calling deleteVaultedShopper(Async)");
        }

        return deleteVaultedShopperCall(vaultedShopperId, _callback);

    }


    private ApiResponse<Void> deleteVaultedShopperWithHttpInfo(String vaultedShopperId) throws ApiException {
        okhttp3.Call localVarCall = deleteVaultedShopperValidateBeforeCall(vaultedShopperId, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call deleteVaultedShopperAsync(String vaultedShopperId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteVaultedShopperValidateBeforeCall(vaultedShopperId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class DeleteVaultedShopperRequestBuilder {
        private final String vaultedShopperId;

        private DeleteVaultedShopperRequestBuilder(String vaultedShopperId) {
            this.vaultedShopperId = vaultedShopperId;
        }

        /**
         * Build call for deleteVaultedShopper
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return deleteVaultedShopperCall(vaultedShopperId, _callback);
        }


        /**
         * Execute deleteVaultedShopper request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            deleteVaultedShopperWithHttpInfo(vaultedShopperId);
        }

        /**
         * Execute deleteVaultedShopper request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            return deleteVaultedShopperWithHttpInfo(vaultedShopperId);
        }

        /**
         * Execute deleteVaultedShopper request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return deleteVaultedShopperAsync(vaultedShopperId, _callback);
        }
    }

    /**
     * Delete Vaulted Shopper
     * 
     * @param vaultedShopperId vaultedShopperId received from BlueSnap (required)
     * @return DeleteVaultedShopperRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public DeleteVaultedShopperRequestBuilder deleteVaultedShopper(String vaultedShopperId) throws IllegalArgumentException {
        if (vaultedShopperId == null) throw new IllegalArgumentException("\"vaultedShopperId\" is required but got null");
            

        return new DeleteVaultedShopperRequestBuilder(vaultedShopperId);
    }
    private okhttp3.Call getCall(String vaultedShopperId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/vaulted-shoppers/{vaultedShopperId}"
            .replace("{" + "vaultedShopperId" + "}", localVarApiClient.escapeString(vaultedShopperId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "sec0", "sec1" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getValidateBeforeCall(String vaultedShopperId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'vaultedShopperId' is set
        if (vaultedShopperId == null) {
            throw new ApiException("Missing the required parameter 'vaultedShopperId' when calling get(Async)");
        }

        return getCall(vaultedShopperId, _callback);

    }


    private ApiResponse<Void> getWithHttpInfo(String vaultedShopperId) throws ApiException {
        okhttp3.Call localVarCall = getValidateBeforeCall(vaultedShopperId, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call getAsync(String vaultedShopperId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = getValidateBeforeCall(vaultedShopperId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class GetRequestBuilder {
        private final String vaultedShopperId;

        private GetRequestBuilder(String vaultedShopperId) {
            this.vaultedShopperId = vaultedShopperId;
        }

        /**
         * Build call for get
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getCall(vaultedShopperId, _callback);
        }


        /**
         * Execute get request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            getWithHttpInfo(vaultedShopperId);
        }

        /**
         * Execute get request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            return getWithHttpInfo(vaultedShopperId);
        }

        /**
         * Execute get request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return getAsync(vaultedShopperId, _callback);
        }
    }

    /**
     * Retrieve Vaulted Shopper
     * 
     * @param vaultedShopperId vaultedShopperId received from BlueSnap (required)
     * @return GetRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public GetRequestBuilder get(String vaultedShopperId) throws IllegalArgumentException {
        if (vaultedShopperId == null) throw new IllegalArgumentException("\"vaultedShopperId\" is required but got null");
            

        return new GetRequestBuilder(vaultedShopperId);
    }
    private okhttp3.Call updateVaultedShopperCall(String vaultedShopperId, ShopperUpdateVaultedShopperRequest shopperUpdateVaultedShopperRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = shopperUpdateVaultedShopperRequest;

        // create path and map variables
        String localVarPath = "/vaulted-shoppers/{vaultedShopperId}"
            .replace("{" + "vaultedShopperId" + "}", localVarApiClient.escapeString(vaultedShopperId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "sec0", "sec1" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateVaultedShopperValidateBeforeCall(String vaultedShopperId, ShopperUpdateVaultedShopperRequest shopperUpdateVaultedShopperRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'vaultedShopperId' is set
        if (vaultedShopperId == null) {
            throw new ApiException("Missing the required parameter 'vaultedShopperId' when calling updateVaultedShopper(Async)");
        }

        return updateVaultedShopperCall(vaultedShopperId, shopperUpdateVaultedShopperRequest, _callback);

    }


    private ApiResponse<Void> updateVaultedShopperWithHttpInfo(String vaultedShopperId, ShopperUpdateVaultedShopperRequest shopperUpdateVaultedShopperRequest) throws ApiException {
        okhttp3.Call localVarCall = updateVaultedShopperValidateBeforeCall(vaultedShopperId, shopperUpdateVaultedShopperRequest, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call updateVaultedShopperAsync(String vaultedShopperId, ShopperUpdateVaultedShopperRequest shopperUpdateVaultedShopperRequest, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateVaultedShopperValidateBeforeCall(vaultedShopperId, shopperUpdateVaultedShopperRequest, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class UpdateVaultedShopperRequestBuilder {
        private final String vaultedShopperId;
        private ShopperUpdateVaultedShopperRequestPaymentSources paymentSources;
        private String firstName;
        private String lastName;

        private UpdateVaultedShopperRequestBuilder(String vaultedShopperId) {
            this.vaultedShopperId = vaultedShopperId;
        }

        /**
         * Set paymentSources
         * @param paymentSources  (optional)
         * @return UpdateVaultedShopperRequestBuilder
         */
        public UpdateVaultedShopperRequestBuilder paymentSources(ShopperUpdateVaultedShopperRequestPaymentSources paymentSources) {
            this.paymentSources = paymentSources;
            return this;
        }
        
        /**
         * Set firstName
         * @param firstName  (optional, default to FirstName)
         * @return UpdateVaultedShopperRequestBuilder
         */
        public UpdateVaultedShopperRequestBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        
        /**
         * Set lastName
         * @param lastName  (optional, default to LastName)
         * @return UpdateVaultedShopperRequestBuilder
         */
        public UpdateVaultedShopperRequestBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        
        /**
         * Build call for updateVaultedShopper
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            ShopperUpdateVaultedShopperRequest shopperUpdateVaultedShopperRequest = buildBodyParams();
            return updateVaultedShopperCall(vaultedShopperId, shopperUpdateVaultedShopperRequest, _callback);
        }

        private ShopperUpdateVaultedShopperRequest buildBodyParams() {
            ShopperUpdateVaultedShopperRequest shopperUpdateVaultedShopperRequest = new ShopperUpdateVaultedShopperRequest();
            shopperUpdateVaultedShopperRequest.paymentSources(this.paymentSources);
            shopperUpdateVaultedShopperRequest.firstName(this.firstName);
            shopperUpdateVaultedShopperRequest.lastName(this.lastName);
            return shopperUpdateVaultedShopperRequest;
        }

        /**
         * Execute updateVaultedShopper request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            ShopperUpdateVaultedShopperRequest shopperUpdateVaultedShopperRequest = buildBodyParams();
            updateVaultedShopperWithHttpInfo(vaultedShopperId, shopperUpdateVaultedShopperRequest);
        }

        /**
         * Execute updateVaultedShopper request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            ShopperUpdateVaultedShopperRequest shopperUpdateVaultedShopperRequest = buildBodyParams();
            return updateVaultedShopperWithHttpInfo(vaultedShopperId, shopperUpdateVaultedShopperRequest);
        }

        /**
         * Execute updateVaultedShopper request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            ShopperUpdateVaultedShopperRequest shopperUpdateVaultedShopperRequest = buildBodyParams();
            return updateVaultedShopperAsync(vaultedShopperId, shopperUpdateVaultedShopperRequest, _callback);
        }
    }

    /**
     * Update Vaulted Shopper
     * 
     * @param vaultedShopperId vaultedShopperId received from BlueSnap (required)
     * @return UpdateVaultedShopperRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public UpdateVaultedShopperRequestBuilder updateVaultedShopper(String vaultedShopperId) throws IllegalArgumentException {
        if (vaultedShopperId == null) throw new IllegalArgumentException("\"vaultedShopperId\" is required but got null");
            

        return new UpdateVaultedShopperRequestBuilder(vaultedShopperId);
    }
}
