# FactSet.SDK.ProcuretoPayInvoiceandBilling.Model.InvoiceDetails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**InvoiceTitle** | **string** |  | [optional] 
**InvoiceId** | **string** | &#x3D;accountId + 2 char year + 2 char month | [optional] 
**Invoicedate** | **string** |  | [optional] 
**AccountId** | **string** |  | [optional] 
**CompanyName** | **string** |  | [optional] 
**ServicesRenderedCompanyName** | **string** | If invoice is paid by a 3rd party company the name will appear here. | [optional] 
**StartPeriod** | **string** |  | [optional] 
**EndPeriod** | **string** |  | [optional] 
**CurrencyId** | **string** |  | [optional] 
**CurrencySymbol** | **string** |  | [optional] 
**OpeningBalance** | **int** | Any prior unpaid balances. | [optional] 
**BillingAdjustementsTotal** | **int** |  | [optional] 
**Tax** | **int** |  | [optional] 
**ClosingBalance** | **int** | Current account balance. | [optional] 
**ServiceDetails** | [**InvoiceDetailsServiceDetails**](InvoiceDetailsServiceDetails.md) |  | [optional] 
**NonRecurringDetails** | [**InvoiceDetailsNonRecurringDetails**](InvoiceDetailsNonRecurringDetails.md) |  | [optional] 
**TaxDetails** | [**List&lt;InvoiceDetailsTaxDetails&gt;**](InvoiceDetailsTaxDetails.md) |  | [optional] 
**StatementofAccountDetails** | [**List&lt;InvoiceDetailsStatementofAccountDetails&gt;**](InvoiceDetailsStatementofAccountDetails.md) |  | [optional] 
**SubscriptionChanges** | [**InvoiceDetailsSubscriptionChanges**](InvoiceDetailsSubscriptionChanges.md) |  | [optional] 
**Notes** | **List&lt;string&gt;** |  | [optional] 
**BillingAdjustments** | [**List&lt;InvoiceDetailsBillingAdjustments&gt;**](InvoiceDetailsBillingAdjustments.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

