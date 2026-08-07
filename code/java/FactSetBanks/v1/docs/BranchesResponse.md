

# BranchesResponse

Response containing branch and location data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**java.util.List&lt;Branch&gt;**](Branch.md) | Array of branch and location data. Structure varies by coverage type: * **US** — Aggregated branch counts and deposit market share by geographic area * **CREDIT_UNION** — Individual credit union branch/ATM locations * **AUSTRALIA** — Individual service channel locations * **GLOBAL** — Individual branch locations (ex-US)  |  [optional]
**meta** | [**Meta**](Meta.md) |  |  [optional]


## Implemented Interfaces

* Serializable


