<div align="left">

[![Visit Bluesnap](./header.png)](https://www.bluesnap.com&#x2F;)

# [Bluesnap](https://www.bluesnap.com&#x2F;)

At BlueSnap, we look at payments a little differently. Our Payment Orchestration Platform helps businesses accept payments globally and is designed to increase revenue and reduces costs. We provide a comprehensive back-end solutions that simplifies the complexity of payments, managing the full process from start to finish.

BlueSnap supports payments through multiple sales channels such as online and mobile sales, marketplaces, subscriptions, invoice payments and manual orders through a virtual terminal. And for businesses looking for embedded payments, we offer white-labeled payments for platforms with automated underwriting and onboarding that supports marketplaces and split payments.

And with one integration and contract, businesses can sell in over 200 geographies with access to local acquiring in 47 countries, 110+ currencies and 100+ global payment types, including popular eWallets, automated accounts receivable, world-class fraud protection and chargeback management, built-in solutions for regulation and tax compliance, and unified global reporting to help businesses grow.

With a US headquarters in Waltham, MA, and EU headquarters in Dublin, Ireland, BlueSnap is backed by world-class private equity investors including Great Hill Partners and Parthenon Capital Partners. 

Learn more at BlueSnap.com

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=BlueSnap&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>blue-snap-java-sdk</artifactId>
  <version>8976-Tools</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:blue-snap-java-sdk:8976-Tools"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/blue-snap-java-sdk-8976-Tools.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueSnap;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AgreementApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://sandbox.bluesnap.com/services/2";
    
    // Configure HTTP basic authorization: sec0
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    
    configuration.sec1  = "YOUR API KEY";
    BlueSnap client = new BlueSnap(configuration);
    String region = "ca"; // Represents the country. Possible Values: `au`, `ca`
    String type = "onetime"; // Represents the mandate type. Possible Values: `onetime`,`recurring`, `ondemand`
    String planid = "planid_example"; // SKU number
    String overriderecurringchargeamount = "overriderecurringchargeamount_example"; // the amount which overrides recurring charge
    try {
      client
              .agreement
              .createDebitForAusCan(region, type)
              .planid(planid)
              .overriderecurringchargeamount(overriderecurringchargeamount)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AgreementApi#createDebitForAusCan");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .agreement
              .createDebitForAusCan(region, type)
              .planid(planid)
              .overriderecurringchargeamount(overriderecurringchargeamount)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AgreementApi#createDebitForAusCan");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://sandbox.bluesnap.com/services/2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AgreementApi* | [**createDebitForAusCan**](docs/AgreementApi.md#createDebitForAusCan) | **POST** /agreements/debit/{region}/{type} | Create Debit Agreement
*AgreementApi* | [**getDebit**](docs/AgreementApi.md#getDebit) | **GET** /agreements/{agreementId} | Get Debit Agreement
*AuthorizationApi* | [**createTransaction**](docs/AuthorizationApi.md#createTransaction) | **POST** /transactions | Auth Only
*PlanApi* | [**createRecurringPlan**](docs/PlanApi.md#createRecurringPlan) | **POST** /recurring/plans | Create Plan
*PlanApi* | [**getAll**](docs/PlanApi.md#getAll) | **GET** /recurring/plans?{parameters} | Retrieve All Plans
*PlanApi* | [**getSpecific**](docs/PlanApi.md#getSpecific) | **GET** /recurring/plans/{planId} | Retrieve Specific Plan
*PlanApi* | [**updateRecurringPlan**](docs/PlanApi.md#updateRecurringPlan) | **PUT** /recurring/plans/{planId} | Update Plan
*ReversalApi* | [**authTransaction**](docs/ReversalApi.md#authTransaction) | **PUT** /transactions | Auth Reversal
*ShopperApi* | [**createVaultedShopper**](docs/ShopperApi.md#createVaultedShopper) | **POST** /vaulted-shoppers | Create Vaulted Shopper
*ShopperApi* | [**deleteVaultedShopper**](docs/ShopperApi.md#deleteVaultedShopper) | **DELETE** /vaulted-shoppers/{vaultedShopperId} | Delete Vaulted Shopper
*ShopperApi* | [**get**](docs/ShopperApi.md#get) | **GET** /vaulted-shoppers/{vaultedShopperId} | Retrieve Vaulted Shopper
*ShopperApi* | [**updateVaultedShopper**](docs/ShopperApi.md#updateVaultedShopper) | **PUT** /vaulted-shoppers/{vaultedShopperId} | Update Vaulted Shopper
*SubscriptionApi* | [**createMerchantManagedCharge**](docs/SubscriptionApi.md#createMerchantManagedCharge) | **POST** /recurring/ondemand/{subscriptionId} | Create Merchant-Managed Subscription Charge
*SubscriptionApi* | [**createMerchantManagedSubscription**](docs/SubscriptionApi.md#createMerchantManagedSubscription) | **POST** /recurring/ondemand | Create Merchant-Managed Subscription
*SubscriptionApi* | [**createNew**](docs/SubscriptionApi.md#createNew) | **POST** /recurring/subscriptions | Create Subscription
*SubscriptionApi* | [**getSpecific**](docs/SubscriptionApi.md#getSpecific) | **GET** /recurring/subscriptions/{subscriptionId} | Retrieve Specific Subscription
*SubscriptionApi* | [**getSwitchChargeAmount**](docs/SubscriptionApi.md#getSwitchChargeAmount) | **GET** /recurring/subscriptions/:subscriptionId/switch-charge-amount | Retrieve Subscription Switch Charge Amount
*SubscriptionApi* | [**listAllSubscriptions**](docs/SubscriptionApi.md#listAllSubscriptions) | **GET** /recurring/subscriptions?{parameters} | Retrieve All Subscriptions
*SubscriptionApi* | [**listCharges**](docs/SubscriptionApi.md#listCharges) | **GET** /:subscriptionId/charges?{parameters} | Retrieve All Charges for a Subscription
*SubscriptionApi* | [**updateSubscription**](docs/SubscriptionApi.md#updateSubscription) | **PUT** /recurring/subscriptions/{subscriptionId} | Update Subscription
*TransactionApi* | [**approveMerchantTransaction**](docs/TransactionApi.md#approveMerchantTransaction) | **PUT** /transactions/approval | Merchant Approve Transaction
*TransactionApi* | [**cancelPendingRefund**](docs/TransactionApi.md#cancelPendingRefund) | **DELETE** /transactions/pending-refund/{transactionId} | Cancel Pending Refund
*TransactionApi* | [**createBatchTransaction**](docs/TransactionApi.md#createBatchTransaction) | **POST** /batch-transactions | Create Batch Transaction
*TransactionApi* | [**createSofortTransaction**](docs/TransactionApi.md#createSofortTransaction) | **POST** /alt-transactions | Create Sofort Transaction
*TransactionApi* | [**getBatchTransaction**](docs/TransactionApi.md#getBatchTransaction) | **GET** /batch-transactions/{batchId} | Retrieve Batch Transaction
*TransactionApi* | [**getById**](docs/TransactionApi.md#getById) | **GET** /transactions/{transactionId} | Retrieve
*TransactionApi* | [**getPaypalTransaction**](docs/TransactionApi.md#getPaypalTransaction) | **GET** /alt-transactions/resolve?orderId&#x3D;{orderId} | Retrieve PayPal Transaction
*TransactionApi* | [**getPreNotificationDebitAgreement**](docs/TransactionApi.md#getPreNotificationDebitAgreement) | **GET** /agreements/prenotification/{transactionId} | Get Pre-Notification Debit Agreement
*TransactionApi* | [**getSepaDd**](docs/TransactionApi.md#getSepaDd) | **GET** /alt-transactions/{transactionId} | Retrieve SEPA DD Transaction
*TransactionApi* | [**getSofortTransaction**](docs/TransactionApi.md#getSofortTransaction) | **GET** /alt-transactions/resolve | Retrieve Sofort Transaction
*TransactionApi* | [**initiateRefund**](docs/TransactionApi.md#initiateRefund) | **POST** /transactions/refund/{transactionId} | Refund
*TransactionApi* | [**updatePaypalTransaction**](docs/TransactionApi.md#updatePaypalTransaction) | **PUT** /alt-transactions | Update PayPal Transaction
*VendorApi* | [**create**](docs/VendorApi.md#create) | **POST** /vendors | Create Vendor
*VendorApi* | [**getAllVendors**](docs/VendorApi.md#getAllVendors) | **GET** /vendors?{parameters} | Retrieve All Vendors
*VendorApi* | [**getVendor**](docs/VendorApi.md#getVendor) | **GET** /vendors/{vendorId} | Retrieve Vendor
*VendorApi* | [**updateVendor**](docs/VendorApi.md#updateVendor) | **PUT** /vendors/{vendorId} | Update Vendor


## Documentation for Models

 - [AuthorizationCreateTransactionRequest](docs/AuthorizationCreateTransactionRequest.md)
 - [AuthorizationCreateTransactionRequestCardHolderInfo](docs/AuthorizationCreateTransactionRequestCardHolderInfo.md)
 - [AuthorizationCreateTransactionRequestCreditCard](docs/AuthorizationCreateTransactionRequestCreditCard.md)
 - [PlanCreateRecurringPlanRequest](docs/PlanCreateRecurringPlanRequest.md)
 - [PlanUpdateRecurringPlanRequest](docs/PlanUpdateRecurringPlanRequest.md)
 - [ReversalAuthTransactionRequest](docs/ReversalAuthTransactionRequest.md)
 - [ShopperCreateVaultedShopperRequest](docs/ShopperCreateVaultedShopperRequest.md)
 - [ShopperCreateVaultedShopperRequestPaymentSources](docs/ShopperCreateVaultedShopperRequestPaymentSources.md)
 - [ShopperCreateVaultedShopperRequestPaymentSourcesCreditCardInfoInner](docs/ShopperCreateVaultedShopperRequestPaymentSourcesCreditCardInfoInner.md)
 - [ShopperCreateVaultedShopperRequestPaymentSourcesCreditCardInfoInnerCreditCard](docs/ShopperCreateVaultedShopperRequestPaymentSourcesCreditCardInfoInnerCreditCard.md)
 - [ShopperUpdateVaultedShopperRequest](docs/ShopperUpdateVaultedShopperRequest.md)
 - [ShopperUpdateVaultedShopperRequestPaymentSources](docs/ShopperUpdateVaultedShopperRequestPaymentSources.md)
 - [ShopperUpdateVaultedShopperRequestPaymentSourcesCreditCardInfoInner](docs/ShopperUpdateVaultedShopperRequestPaymentSourcesCreditCardInfoInner.md)
 - [ShopperUpdateVaultedShopperRequestPaymentSourcesCreditCardInfoInnerCreditCard](docs/ShopperUpdateVaultedShopperRequestPaymentSourcesCreditCardInfoInnerCreditCard.md)
 - [SubscriptionCreateMerchantManagedChargeRequest](docs/SubscriptionCreateMerchantManagedChargeRequest.md)
 - [SubscriptionCreateMerchantManagedSubscriptionRequest](docs/SubscriptionCreateMerchantManagedSubscriptionRequest.md)
 - [SubscriptionCreateMerchantManagedSubscriptionRequestPayerInfo](docs/SubscriptionCreateMerchantManagedSubscriptionRequestPayerInfo.md)
 - [SubscriptionCreateMerchantManagedSubscriptionRequestPaymentSource](docs/SubscriptionCreateMerchantManagedSubscriptionRequestPaymentSource.md)
 - [SubscriptionCreateMerchantManagedSubscriptionRequestPaymentSourceCreditCardInfo](docs/SubscriptionCreateMerchantManagedSubscriptionRequestPaymentSourceCreditCardInfo.md)
 - [SubscriptionCreateMerchantManagedSubscriptionRequestPaymentSourceCreditCardInfoCreditCard](docs/SubscriptionCreateMerchantManagedSubscriptionRequestPaymentSourceCreditCardInfoCreditCard.md)
 - [SubscriptionCreateNewRequest](docs/SubscriptionCreateNewRequest.md)
 - [SubscriptionCreateNewRequestPayerInfo](docs/SubscriptionCreateNewRequestPayerInfo.md)
 - [SubscriptionCreateNewRequestPaymentSource](docs/SubscriptionCreateNewRequestPaymentSource.md)
 - [SubscriptionCreateNewRequestPaymentSourceCreditCardInfo](docs/SubscriptionCreateNewRequestPaymentSourceCreditCardInfo.md)
 - [SubscriptionCreateNewRequestPaymentSourceCreditCardInfoCreditCard](docs/SubscriptionCreateNewRequestPaymentSourceCreditCardInfoCreditCard.md)
 - [SubscriptionUpdateSubscriptionRequest](docs/SubscriptionUpdateSubscriptionRequest.md)
 - [TransactionCreateBatchTransactionRequest](docs/TransactionCreateBatchTransactionRequest.md)
 - [TransactionCreateBatchTransactionRequestBatchTransaction](docs/TransactionCreateBatchTransactionRequestBatchTransaction.md)
 - [TransactionCreateBatchTransactionRequestBatchTransactionCardTransactionInner](docs/TransactionCreateBatchTransactionRequestBatchTransactionCardTransactionInner.md)
 - [TransactionCreateBatchTransactionRequestBatchTransactionCardTransactionInnerCardHolderInfo](docs/TransactionCreateBatchTransactionRequestBatchTransactionCardTransactionInnerCardHolderInfo.md)
 - [TransactionCreateBatchTransactionRequestBatchTransactionCardTransactionInnerCreditCard](docs/TransactionCreateBatchTransactionRequestBatchTransactionCardTransactionInnerCreditCard.md)
 - [TransactionCreateSofortTransactionRequest](docs/TransactionCreateSofortTransactionRequest.md)
 - [TransactionCreateSofortTransactionRequestAcssDirectDebitTransaction](docs/TransactionCreateSofortTransactionRequestAcssDirectDebitTransaction.md)
 - [TransactionCreateSofortTransactionRequestBecsDirectDebitTransaction](docs/TransactionCreateSofortTransactionRequestBecsDirectDebitTransaction.md)
 - [TransactionCreateSofortTransactionRequestEcpTransaction](docs/TransactionCreateSofortTransactionRequestEcpTransaction.md)
 - [TransactionCreateSofortTransactionRequestIdealTransaction](docs/TransactionCreateSofortTransactionRequestIdealTransaction.md)
 - [TransactionCreateSofortTransactionRequestLocalBankTransferTransaction](docs/TransactionCreateSofortTransactionRequestLocalBankTransferTransaction.md)
 - [TransactionCreateSofortTransactionRequestPayerInfo](docs/TransactionCreateSofortTransactionRequestPayerInfo.md)
 - [TransactionCreateSofortTransactionRequestPaypalTransaction](docs/TransactionCreateSofortTransactionRequestPaypalTransaction.md)
 - [TransactionCreateSofortTransactionRequestSepaDirectDebitTransaction](docs/TransactionCreateSofortTransactionRequestSepaDirectDebitTransaction.md)
 - [TransactionCreateSofortTransactionRequestSofortTransaction](docs/TransactionCreateSofortTransactionRequestSofortTransaction.md)
 - [TransactionInitiateRefundRequest](docs/TransactionInitiateRefundRequest.md)
 - [TransactionInitiateRefundRequestTransactionMetaData](docs/TransactionInitiateRefundRequestTransactionMetaData.md)
 - [TransactionInitiateRefundRequestTransactionMetaDataMetaDataInner](docs/TransactionInitiateRefundRequestTransactionMetaDataMetaDataInner.md)
 - [TransactionUpdatePaypalTransactionRequest](docs/TransactionUpdatePaypalTransactionRequest.md)
 - [TransactionUpdatePaypalTransactionRequestPaypalTransaction](docs/TransactionUpdatePaypalTransactionRequestPaypalTransaction.md)
 - [VendorCreateRequest](docs/VendorCreateRequest.md)
 - [VendorCreateRequestVendorAgreement](docs/VendorCreateRequestVendorAgreement.md)
 - [VendorCreateRequestVendorPrincipal](docs/VendorCreateRequestVendorPrincipal.md)
 - [VendorUpdateVendorRequest](docs/VendorUpdateVendorRequest.md)
 - [VendorUpdateVendorRequestPayoutInfoInner](docs/VendorUpdateVendorRequestPayoutInfoInner.md)
 - [VendorUpdateVendorRequestVendorAgreement](docs/VendorUpdateVendorRequestVendorAgreement.md)
 - [VendorUpdateVendorRequestVendorPrincipal](docs/VendorUpdateVendorRequestVendorPrincipal.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
