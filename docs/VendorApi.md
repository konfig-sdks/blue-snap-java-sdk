# VendorApi

All URIs are relative to *https://sandbox.bluesnap.com/services/2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](VendorApi.md#create) | **POST** /vendors | Create Vendor |
| [**getAllVendors**](VendorApi.md#getAllVendors) | **GET** /vendors?{parameters} | Retrieve All Vendors |
| [**getVendor**](VendorApi.md#getVendor) | **GET** /vendors/{vendorId} | Retrieve Vendor |
| [**updateVendor**](VendorApi.md#updateVendor) | **PUT** /vendors/{vendorId} | Update Vendor |


<a name="create"></a>
# **create**
> create().vendorCreateRequest(vendorCreateRequest).execute();

Create Vendor



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueSnap;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VendorApi;
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
    String email = "vendor@example.com";
    String firstName = "Joe";
    String lastName = "Smith";
    String phone = "1-123-456-7890";
    String address = "123 Main Street";
    String city = "Boston";
    String country = "US";
    String state = "MA";
    String zip = "02453";
    String defaultPayoutCurrency = "USD";
    String ipnUrl = "https://ipnaddress.com";
    VendorCreateRequestVendorPrincipal vendorPrincipal = new VendorCreateRequestVendorPrincipal();
    VendorCreateRequestVendorAgreement vendorAgreement = new VendorCreateRequestVendorAgreement();
    Object payoutInfo = null;
    try {
      client
              .vendor
              .create()
              .email(email)
              .firstName(firstName)
              .lastName(lastName)
              .phone(phone)
              .address(address)
              .city(city)
              .country(country)
              .state(state)
              .zip(zip)
              .defaultPayoutCurrency(defaultPayoutCurrency)
              .ipnUrl(ipnUrl)
              .vendorPrincipal(vendorPrincipal)
              .vendorAgreement(vendorAgreement)
              .payoutInfo(payoutInfo)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling VendorApi#create");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .vendor
              .create()
              .email(email)
              .firstName(firstName)
              .lastName(lastName)
              .phone(phone)
              .address(address)
              .city(city)
              .country(country)
              .state(state)
              .zip(zip)
              .defaultPayoutCurrency(defaultPayoutCurrency)
              .ipnUrl(ipnUrl)
              .vendorPrincipal(vendorPrincipal)
              .vendorAgreement(vendorAgreement)
              .payoutInfo(payoutInfo)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling VendorApi#create");
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
| **vendorCreateRequest** | [**VendorCreateRequest**](VendorCreateRequest.md)|  | [optional] |

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

<a name="getAllVendors"></a>
# **getAllVendors**
> getAllVendors().gettotal(gettotal).execute();

Retrieve All Vendors



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueSnap;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VendorApi;
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
    Boolean gettotal = true;
    try {
      client
              .vendor
              .getAllVendors()
              .gettotal(gettotal)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling VendorApi#getAllVendors");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .vendor
              .getAllVendors()
              .gettotal(gettotal)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling VendorApi#getAllVendors");
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
| **gettotal** | **Boolean**|  | [optional] [default to true] |

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

<a name="getVendor"></a>
# **getVendor**
> getVendor(vendorId).execute();

Retrieve Vendor



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueSnap;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VendorApi;
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
    Integer vendorId = 837389; // BlueSnap identifier for the vendor
    try {
      client
              .vendor
              .getVendor(vendorId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling VendorApi#getVendor");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .vendor
              .getVendor(vendorId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling VendorApi#getVendor");
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
| **vendorId** | **Integer**| BlueSnap identifier for the vendor | [default to 837389] |

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

<a name="updateVendor"></a>
# **updateVendor**
> updateVendor(vendorId).vendorUpdateVendorRequest(vendorUpdateVendorRequest).execute();

Update Vendor



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BlueSnap;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VendorApi;
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
    Integer vendorId = 56; // BlueSnap identifier for the vendor
    String email = "vendor@bluesnap.com";
    String name = "Important Vendor";
    String firstName = "Joe";
    String lastName = "Smith";
    String address = "123 Main Street";
    String city = "testing city";
    String zip = "02453";
    String country = "US";
    String phone = "1-054-976-6778";
    String state = "MA";
    Integer taxId = 123456789;
    String vendorUrl = "http://mycompany.com";
    String ipnUrl = "https://ipnaddress.com";
    String defaultPayoutCurrency = "USD";
    VendorUpdateVendorRequestVendorPrincipal vendorPrincipal = new VendorUpdateVendorRequestVendorPrincipal();
    List<VendorUpdateVendorRequestPayoutInfoInner> payoutInfo = Arrays.asList();
    VendorUpdateVendorRequestVendorAgreement vendorAgreement = new VendorUpdateVendorRequestVendorAgreement();
    try {
      client
              .vendor
              .updateVendor(vendorId)
              .email(email)
              .name(name)
              .firstName(firstName)
              .lastName(lastName)
              .address(address)
              .city(city)
              .zip(zip)
              .country(country)
              .phone(phone)
              .state(state)
              .taxId(taxId)
              .vendorUrl(vendorUrl)
              .ipnUrl(ipnUrl)
              .defaultPayoutCurrency(defaultPayoutCurrency)
              .vendorPrincipal(vendorPrincipal)
              .payoutInfo(payoutInfo)
              .vendorAgreement(vendorAgreement)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling VendorApi#updateVendor");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .vendor
              .updateVendor(vendorId)
              .email(email)
              .name(name)
              .firstName(firstName)
              .lastName(lastName)
              .address(address)
              .city(city)
              .zip(zip)
              .country(country)
              .phone(phone)
              .state(state)
              .taxId(taxId)
              .vendorUrl(vendorUrl)
              .ipnUrl(ipnUrl)
              .defaultPayoutCurrency(defaultPayoutCurrency)
              .vendorPrincipal(vendorPrincipal)
              .payoutInfo(payoutInfo)
              .vendorAgreement(vendorAgreement)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling VendorApi#updateVendor");
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
| **vendorId** | **Integer**| BlueSnap identifier for the vendor | |
| **vendorUpdateVendorRequest** | [**VendorUpdateVendorRequest**](VendorUpdateVendorRequest.md)|  | [optional] |

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

