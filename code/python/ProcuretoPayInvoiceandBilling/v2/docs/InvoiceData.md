# InvoiceData

Contains invoice details

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**invoice_title** | **str** | Invoice Title | [optional] 
**invoice_id** | **str** | Concatenation of AccountID and Date as YYMM | [optional] 
**invoice_date** | **datetime** | Invoice issue date | [optional] 
**account_id** | **str** | Unique Invoice Reference | [optional] 
**company_name** | **str** | Business Name | [optional] 
**services_rendered_company_name** | **str** | TBD | [optional] 
**start_period** | **datetime** | Billing period start date | [optional] 
**end_period** | **datetime** | Billing period end date | [optional] 
**currency_id** | **str** | Invoice currency type | [optional] 
**currency_symbol** | **str** | Invoice currency symbol | [optional] 
**opening_balance** | **float** | I | [optional] 
**billing_adjustments_total** | **float** | Credits applied to invoice | [optional] 
**tax** | **float** | Taxes applied to invoice | [optional] 
**closing_balance** | **float** | TBD | [optional] 
**service_details** | **{str: ([ServiceDetail],)}** | Billable line items | [optional] 
**non_recurring_details** | **{str: ([ServiceDetail],)}** | Non Recurring billable line items | [optional] 
**tax_details** | [**[TaxDetail]**](TaxDetail.md) | TBD | [optional] 
**billing_address_details** | [**[BillingAddress]**](BillingAddress.md) | Mailing address for invoice | [optional] 
**statement_of_account_details** | [**[StatementOfAccount]**](StatementOfAccount.md) | TBD | [optional] 
**subscription_changes** | **{str: ([SubscriptionChange],)}** | Contains subscription change details. | [optional] 
**notes** | **[str]** | Account notes | [optional] 
**billing_adjustments** | [**[BillingAdjustment]**](BillingAdjustment.md) | TBD | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


