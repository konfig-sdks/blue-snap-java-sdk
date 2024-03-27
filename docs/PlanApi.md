# PlanApi

All URIs are relative to *https://sandbox.bluesnap.com/services/2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createRecurringPlan**](PlanApi.md#createRecurringPlan) | **POST** /recurring/plans | Create Plan |
| [**getAll**](PlanApi.md#getAll) | **GET** /recurring/plans?{parameters} | Retrieve All Plans |
| [**getSpecific**](PlanApi.md#getSpecific) | **GET** /recurring/plans/{planId} | Retrieve Specific Plan |
| [**updateRecurringPlan**](PlanApi.md#updateRecurringPlan) | **PUT** /recurring/plans/{planId} | Update Plan |


<a name="createRecurringPlan"></a>
# **createRecurringPlan**
> createRecurringPlan().planCreateRecurringPlanRequest(planCreateRecurringPlanRequest).execute();

Create Plan



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueSnap;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PlanApi;
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
    String chargeFrequency = "MONTHLY";
    Integer gracePeriodDays = 10;
    Integer trialPeriodDays = 14;
    Integer initialChargeAmount = 100;
    String name = "Gold Plan";
    String currency = "USD";
    Integer maxNumberOfCharges = 12;
    Float recurringChargeAmount = 29.99F;
    Boolean chargeOnPlanSwitch = true;
    try {
      client
              .plan
              .createRecurringPlan()
              .chargeFrequency(chargeFrequency)
              .gracePeriodDays(gracePeriodDays)
              .trialPeriodDays(trialPeriodDays)
              .initialChargeAmount(initialChargeAmount)
              .name(name)
              .currency(currency)
              .maxNumberOfCharges(maxNumberOfCharges)
              .recurringChargeAmount(recurringChargeAmount)
              .chargeOnPlanSwitch(chargeOnPlanSwitch)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PlanApi#createRecurringPlan");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .plan
              .createRecurringPlan()
              .chargeFrequency(chargeFrequency)
              .gracePeriodDays(gracePeriodDays)
              .trialPeriodDays(trialPeriodDays)
              .initialChargeAmount(initialChargeAmount)
              .name(name)
              .currency(currency)
              .maxNumberOfCharges(maxNumberOfCharges)
              .recurringChargeAmount(recurringChargeAmount)
              .chargeOnPlanSwitch(chargeOnPlanSwitch)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PlanApi#createRecurringPlan");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **planCreateRecurringPlanRequest** | [**PlanCreateRecurringPlanRequest**](PlanCreateRecurringPlanRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[sec0](../README.md#sec0), [sec1](../README.md#sec1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getAll"></a>
# **getAll**
> getAll().pagesize(pagesize).after(after).gettotal(gettotal).fulldescription(fulldescription).execute();

Retrieve All Plans



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueSnap;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PlanApi;
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
    String pagesize = "5";
    String after = "2185254";
    Boolean gettotal = true;
    Boolean fulldescription = false;
    try {
      client
              .plan
              .getAll()
              .pagesize(pagesize)
              .after(after)
              .gettotal(gettotal)
              .fulldescription(fulldescription)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PlanApi#getAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .plan
              .getAll()
              .pagesize(pagesize)
              .after(after)
              .gettotal(gettotal)
              .fulldescription(fulldescription)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PlanApi#getAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pagesize** | **String**|  | [optional] [default to 5] |
| **after** | **String**|  | [optional] [default to 2185254] |
| **gettotal** | **Boolean**|  | [optional] [default to true] |
| **fulldescription** | **Boolean**|  | [optional] [default to false] |

### Return type

null (empty response body)

### Authorization

[sec0](../README.md#sec0), [sec1](../README.md#sec1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getSpecific"></a>
# **getSpecific**
> getSpecific(planId).execute();

Retrieve Specific Plan



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueSnap;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PlanApi;
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
    Integer planId = 2283845; // BlueSnap identifier for the plan.
    try {
      client
              .plan
              .getSpecific(planId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PlanApi#getSpecific");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .plan
              .getSpecific(planId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PlanApi#getSpecific");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **planId** | **Integer**| BlueSnap identifier for the plan. | [default to 2283845] |

### Return type

null (empty response body)

### Authorization

[sec0](../README.md#sec0), [sec1](../README.md#sec1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateRecurringPlan"></a>
# **updateRecurringPlan**
> updateRecurringPlan(planId).planUpdateRecurringPlanRequest(planUpdateRecurringPlanRequest).execute();

Update Plan



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueSnap;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PlanApi;
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
    Integer planId = 2111111; // BlueSnap identifier for the plan.
    String chargeFrequency = "MONTHLY";
    String trialPeriodDays = "7";
    String initialChargeAmount = "30";
    String name = "Gold Plan";
    String currency = "USD";
    String recurringChargeAmount = "19";
    try {
      client
              .plan
              .updateRecurringPlan(planId)
              .chargeFrequency(chargeFrequency)
              .trialPeriodDays(trialPeriodDays)
              .initialChargeAmount(initialChargeAmount)
              .name(name)
              .currency(currency)
              .recurringChargeAmount(recurringChargeAmount)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PlanApi#updateRecurringPlan");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .plan
              .updateRecurringPlan(planId)
              .chargeFrequency(chargeFrequency)
              .trialPeriodDays(trialPeriodDays)
              .initialChargeAmount(initialChargeAmount)
              .name(name)
              .currency(currency)
              .recurringChargeAmount(recurringChargeAmount)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PlanApi#updateRecurringPlan");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **planId** | **Integer**| BlueSnap identifier for the plan. | [default to 2111111] |
| **planUpdateRecurringPlanRequest** | [**PlanUpdateRecurringPlanRequest**](PlanUpdateRecurringPlanRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[sec0](../README.md#sec0), [sec1](../README.md#sec1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

