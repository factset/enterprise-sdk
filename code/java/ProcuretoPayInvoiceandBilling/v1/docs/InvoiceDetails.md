

# InvoiceDetails


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**invoiceTitle** | **String** |  |  [optional]
**invoiceId** | **String** | &#x3D;accountId + 2 char year + 2 char month |  [optional]
**invoicedate** | **String** |  |  [optional]
**accountId** | **String** |  |  [optional]
**companyName** | **String** |  |  [optional]
**servicesRenderedCompanyName** | **String** | If invoice is paid by a 3rd party company the name will appear here. |  [optional]
**startPeriod** | **String** |  |  [optional]
**endPeriod** | **String** |  |  [optional]
**currencyId** | **String** |  |  [optional]
**currencySymbol** | **String** |  |  [optional]
**openingBalance** | **Integer** | Any prior unpaid balances. |  [optional]
**billingAdjustementsTotal** | **Integer** |  |  [optional]
**tax** | **Integer** |  |  [optional]
**closingBalance** | **Integer** | Current account balance. |  [optional]
**serviceDetails** | [**InvoiceDetailsServiceDetails**](InvoiceDetailsServiceDetails.md) |  |  [optional]
**nonRecurringDetails** | [**InvoiceDetailsNonRecurringDetails**](InvoiceDetailsNonRecurringDetails.md) |  |  [optional]
**taxDetails** | [**java.util.List&lt;InvoiceDetailsTaxDetails&gt;**](InvoiceDetailsTaxDetails.md) |  |  [optional]
**statementofAccountDetails** | [**java.util.List&lt;InvoiceDetailsStatementofAccountDetails&gt;**](InvoiceDetailsStatementofAccountDetails.md) |  |  [optional]
**subscriptionChanges** | [**InvoiceDetailsSubscriptionChanges**](InvoiceDetailsSubscriptionChanges.md) |  |  [optional]
**notes** | **java.util.List&lt;String&gt;** |  |  [optional]
**billingAdjustments** | [**java.util.List&lt;InvoiceDetailsBillingAdjustments&gt;**](InvoiceDetailsBillingAdjustments.md) |  |  [optional]


## Implemented Interfaces

* Serializable


