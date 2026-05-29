

# TransactionSummary


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | Unique identifier of the issuer portfolio company in the request |  [optional]
**transactionId** | **Integer** | Unique identifier of the respective transaction |  [optional]
**portfolioCompanyName** | **String** | Portfolio company name |  [optional]
**announcementDate** | **LocalDate** | Date transaction was announced |  [optional]
**closeDate** | **LocalDate** | Date transaction closed |  [optional]
**totalAmountUsd** | **BigDecimal** | Total transaction amount in USD |  [optional]
**stage** | **String** | The stage type of the transaction |  [optional]
**status** | **String** | Transaction status code |  [optional]
**roundOfFunding** | **String** | Funding round designation |  [optional]
**error** | [**ErrorObjectResponse**](ErrorObjectResponse.md) |  |  [optional]


## Implemented Interfaces

* Serializable


