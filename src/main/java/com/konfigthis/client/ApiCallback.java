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


package com.konfigthis.client;

import java.io.IOException;

import java.util.Map;
import java.util.List;

/**
 * Callback for asynchronous API call.
 *
 * @param <T> The return type
 */
public interface ApiCallback<T> {
    /**
     * This is called when the API call fails.
     *
     * @param e The exception causing the failure
     * @param statusCode Status code of the response if available, otherwise it would be 0
     * @param responseHeaders Headers of the response if available, otherwise it would be null
     */
    void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders);

    /**
     * This is called when the API call succeeded.
     *
     * @param result The result deserialized from response
     * @param statusCode Status code of the response
     * @param responseHeaders Headers of the response
     */
    void onSuccess(T result, int statusCode, Map<String, List<String>> responseHeaders);

    /**
     * This is called when the API upload processing.
     *
     * @param bytesWritten bytes Written
     * @param contentLength content length of request body
     * @param done write end
     */
    default void onUploadProgress(long bytesWritten, long contentLength, boolean done) {
        return;
    }

    /**
     * This is called when the API download processing.
     *
     * @param bytesRead bytes Read
     * @param contentLength content length of the response
     * @param done Read end
     */
    default void onDownloadProgress(long bytesRead, long contentLength, boolean done) {
        return;
    }
}
