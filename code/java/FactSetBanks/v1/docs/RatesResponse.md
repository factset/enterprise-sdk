

# RatesResponse

Response containing deposit rate data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**java.util.List&lt;Rate&gt;**](Rate.md) | Array of deposit rate data. Structure varies based on data type: - **Product rates by balance tier**: One row per product-term-balance tier combination - **Average product rates**: One row per product-term combination - **Location-specific rates**: One row per product-term-state-deposit range combination  |  [optional]
**meta** | [**Meta**](Meta.md) |  |  [optional]


## Implemented Interfaces

* Serializable


