# FactSet.SDK.ProcuretoPayInvoiceandBilling.Model.InvoiceData
Contains invoice details

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**InvoiceTitle** | **string** | Invoice Title | [optional] 
**InvoiceId** | **string** | Concatenation of AccountID and Date as YYMM | [optional] 
**InvoiceDate** | **DateTime** | Invoice issue date | [optional] 
**AccountId** | **string** | Unique Invoice Reference | [optional] 
**CompanyName** | **string** | Business Name | [optional] 
**ServicesRenderedCompanyName** | **string** | TBD | [optional] 
**StartPeriod** | **DateTime** | Billing period start date | [optional] 
**EndPeriod** | **DateTime** | Billing period end date | [optional] 
**CurrencyId** | **string** | Invoice currency type | [optional] 
**CurrencySymbol** | **string** | Invoice currency symbol | [optional] 
**OpeningBalance** | **decimal** | I | [optional] 
**BillingAdjustmentsTotal** | **decimal** | Credits applied to invoice | [optional] 
**Tax** | **decimal** | Taxes applied to invoice | [optional] 
**ClosingBalance** | **decimal** | TBD | [optional] 
**ServiceDetails** | **Dictionary&lt;string, List&lt;ServiceDetail&gt;&gt;** | Billable line items | [optional] 
**NonRecurringDetails** | **Dictionary&lt;string, List&lt;ServiceDetail&gt;&gt;** | Non Recurring billable line items | [optional] 
**TaxDetails** | [**List&lt;TaxDetail&gt;**](TaxDetail.md) | TBD | [optional] 
**BillingAddressDetails** | [**List&lt;BillingAddress&gt;**](BillingAddress.md) | Mailing address for invoice | [optional] 
**StatementOfAccountDetails** | [**List&lt;StatementOfAccount&gt;**](StatementOfAccount.md) | TBD | [optional] 
**SubscriptionChanges** | **Dictionary&lt;string, List&lt;SubscriptionChange&gt;&gt;** | Contains subscription change details. | [optional] 
**Notes** | **List&lt;string&gt;** | Account notes | [optional] 
**BillingAdjustments** | [**List&lt;BillingAdjustment&gt;**](BillingAdjustment.md) | TBD | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

