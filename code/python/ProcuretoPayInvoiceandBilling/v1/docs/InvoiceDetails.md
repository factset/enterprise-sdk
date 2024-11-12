# InvoiceDetails


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**invoice_title** | **str** |  | [optional] 
**invoice_id** | **str** | &#x3D;accountId + 2 char year + 2 char month | [optional] 
**invoicedate** | **str** |  | [optional] 
**account_id** | **str** |  | [optional] 
**company_name** | **str** |  | [optional] 
**services_rendered_company_name** | **str** | If invoice is paid by a 3rd party company the name will appear here. | [optional] 
**start_period** | **str** |  | [optional] 
**end_period** | **str** |  | [optional] 
**currency_id** | **str** |  | [optional] 
**currency_symbol** | **str** |  | [optional] 
**opening_balance** | **int** | Any prior unpaid balances. | [optional] 
**billing_adjustements_total** | **int** |  | [optional] 
**tax** | **int** |  | [optional] 
**closing_balance** | **int** | Current account balance. | [optional] 
**service_details** | [**InvoiceDetailsServiceDetails**](InvoiceDetailsServiceDetails.md) |  | [optional] 
**non_recurring_details** | [**InvoiceDetailsNonRecurringDetails**](InvoiceDetailsNonRecurringDetails.md) |  | [optional] 
**tax_details** | [**[InvoiceDetailsTaxDetails]**](InvoiceDetailsTaxDetails.md) |  | [optional] 
**statementof_account_details** | [**[InvoiceDetailsStatementofAccountDetails]**](InvoiceDetailsStatementofAccountDetails.md) |  | [optional] 
**subscription_changes** | [**InvoiceDetailsSubscriptionChanges**](InvoiceDetailsSubscriptionChanges.md) |  | [optional] 
**notes** | **[str]** |  | [optional] 
**billing_adjustments** | [**[InvoiceDetailsBillingAdjustments]**](InvoiceDetailsBillingAdjustments.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


