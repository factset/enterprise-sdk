# procuretopayinvoiceandbilling.InvoiceDetails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**invoiceTitle** | **String** |  | [optional] 
**invoiceId** | **String** | &#x3D;accountId + 2 char year + 2 char month | [optional] 
**invoicedate** | **String** |  | [optional] 
**accountId** | **String** |  | [optional] 
**companyName** | **String** |  | [optional] 
**servicesRenderedCompanyName** | **String** | If invoice is paid by a 3rd party company the name will appear here. | [optional] 
**startPeriod** | **String** |  | [optional] 
**endPeriod** | **String** |  | [optional] 
**currencyId** | **String** |  | [optional] 
**currencySymbol** | **String** |  | [optional] 
**openingBalance** | **Number** | Any prior unpaid balances. | [optional] 
**billingAdjustementsTotal** | **Number** |  | [optional] 
**tax** | **Number** |  | [optional] 
**closingBalance** | **Number** | Current account balance. | [optional] 
**serviceDetails** | [**InvoiceDetailsServiceDetails**](InvoiceDetailsServiceDetails.md) |  | [optional] 
**nonRecurringDetails** | [**InvoiceDetailsNonRecurringDetails**](InvoiceDetailsNonRecurringDetails.md) |  | [optional] 
**taxDetails** | [**[InvoiceDetailsTaxDetails]**](InvoiceDetailsTaxDetails.md) |  | [optional] 
**statementofAccountDetails** | [**[InvoiceDetailsStatementofAccountDetails]**](InvoiceDetailsStatementofAccountDetails.md) |  | [optional] 
**subscriptionChanges** | [**InvoiceDetailsSubscriptionChanges**](InvoiceDetailsSubscriptionChanges.md) |  | [optional] 
**notes** | **[String]** |  | [optional] 
**billingAdjustments** | [**[InvoiceDetailsBillingAdjustments]**](InvoiceDetailsBillingAdjustments.md) |  | [optional] 


