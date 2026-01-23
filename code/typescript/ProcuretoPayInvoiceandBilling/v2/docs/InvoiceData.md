# procuretopayinvoiceandbilling.InvoiceData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**invoiceTitle** | **String** | Invoice Title | [optional] 
**invoiceId** | **String** | Concatenation of AccountID and Date as YYMM | [optional] 
**invoiceDate** | **Date** | Invoice issue date | [optional] 
**accountId** | **String** | Unique Invoice Reference | [optional] 
**companyName** | **String** | Business Name | [optional] 
**servicesRenderedCompanyName** | **String** | TBD | [optional] 
**startPeriod** | **Date** | Billing period start date | [optional] 
**endPeriod** | **Date** | Billing period end date | [optional] 
**currencyId** | **String** | Invoice currency type | [optional] 
**currencySymbol** | **String** | Invoice currency symbol | [optional] 
**openingBalance** | **Number** | I | [optional] 
**billingAdjustmentsTotal** | **Number** | Credits applied to invoice | [optional] 
**tax** | **Number** | Taxes applied to invoice | [optional] 
**closingBalance** | **Number** | TBD | [optional] 
**serviceDetails** | **{String: [ServiceDetail]}** | Billable line items | [optional] 
**nonRecurringDetails** | **{String: [ServiceDetail]}** | Non Recurring billable line items | [optional] 
**taxDetails** | [**[TaxDetail]**](TaxDetail.md) | TBD | [optional] 
**billingAddressDetails** | [**[BillingAddress]**](BillingAddress.md) | Mailing address for invoice | [optional] 
**statementOfAccountDetails** | [**[StatementOfAccount]**](StatementOfAccount.md) | TBD | [optional] 
**subscriptionChanges** | **{String: [SubscriptionChange]}** | Contains subscription change details. | [optional] 
**notes** | **[String]** | Account notes | [optional] 
**billingAdjustments** | [**[BillingAdjustment]**](BillingAdjustment.md) | TBD | [optional] 


