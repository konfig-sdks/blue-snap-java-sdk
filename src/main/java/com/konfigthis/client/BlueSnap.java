package com.konfigthis.client;

import com.konfigthis.client.api.AgreementApi;
import com.konfigthis.client.api.AuthorizationApi;
import com.konfigthis.client.api.PlanApi;
import com.konfigthis.client.api.ReversalApi;
import com.konfigthis.client.api.ShopperApi;
import com.konfigthis.client.api.SubscriptionApi;
import com.konfigthis.client.api.TransactionApi;
import com.konfigthis.client.api.VendorApi;

public class BlueSnap {
    private ApiClient apiClient;
    public final AgreementApi agreement;
    public final AuthorizationApi authorization;
    public final PlanApi plan;
    public final ReversalApi reversal;
    public final ShopperApi shopper;
    public final SubscriptionApi subscription;
    public final TransactionApi transaction;
    public final VendorApi vendor;

    public BlueSnap() {
        this(null);
    }

    public BlueSnap(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.agreement = new AgreementApi(this.apiClient);
        this.authorization = new AuthorizationApi(this.apiClient);
        this.plan = new PlanApi(this.apiClient);
        this.reversal = new ReversalApi(this.apiClient);
        this.shopper = new ShopperApi(this.apiClient);
        this.subscription = new SubscriptionApi(this.apiClient);
        this.transaction = new TransactionApi(this.apiClient);
        this.vendor = new VendorApi(this.apiClient);
    }

}
