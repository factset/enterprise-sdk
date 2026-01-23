

# InvoiceData

Contains invoice details

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**invoiceTitle** | **String** | Invoice Title |  [optional]
**invoiceId** | **String** | Concatenation of AccountID and Date as YYMM |  [optional]
**invoiceDate** | **OffsetDateTime** | Invoice issue date |  [optional]
**accountId** | **String** | Unique Invoice Reference |  [optional]
**companyName** | **String** | Business Name |  [optional]
**servicesRenderedCompanyName** | **String** | TBD |  [optional]
**startPeriod** | **OffsetDateTime** | Billing period start date |  [optional]
**endPeriod** | **OffsetDateTime** | Billing period end date |  [optional]
**currencyId** | **String** | Invoice currency type |  [optional]
**currencySymbol** | **String** | Invoice currency symbol |  [optional]
**openingBalance** | **BigDecimal** | I |  [optional]
**billingAdjustmentsTotal** | **BigDecimal** | Credits applied to invoice |  [optional]
**tax** | **BigDecimal** | Taxes applied to invoice |  [optional]
**closingBalance** | **BigDecimal** | TBD |  [optional]
**serviceDetails** | **Map&lt;String, java.util.List&lt;ServiceDetail&gt;&gt;** | Billable line items |  [optional]
**nonRecurringDetails** | **Map&lt;String, java.util.List&lt;ServiceDetail&gt;&gt;** | Non Recurring billable line items |  [optional]
**taxDetails** | [**java.util.List&lt;TaxDetail&gt;**](TaxDetail.md) | TBD |  [optional]
**billingAddressDetails** | [**java.util.List&lt;BillingAddress&gt;**](BillingAddress.md) | Mailing address for invoice |  [optional]
**statementOfAccountDetails** | [**java.util.List&lt;StatementOfAccount&gt;**](StatementOfAccount.md) | TBD |  [optional]
**subscriptionChanges** | **Map&lt;String, java.util.List&lt;SubscriptionChange&gt;&gt;** | Contains subscription change details. |  [optional]
**notes** | **java.util.List&lt;String&gt;** | Account notes |  [optional]
**billingAdjustments** | [**java.util.List&lt;BillingAdjustment&gt;**](BillingAdjustment.md) | TBD |  [optional]


## Implemented Interfaces

* Serializable


