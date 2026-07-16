

# Industries


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | FactSet Permanent Entity Identifier. Six alpha-numeric characters, excluding vowels, with an -E suffix (XXXXXX-E). |  [optional]
**requestId** | **String** | The RBICS industry classification identifier submitted in the request. |  [optional]
**companyName** | **String** | The official legal name of the company. This provides a human-readable identifier for the entity. |  [optional]
**date** | **LocalDate** | The specific date on which the company held the specified RBICS Focus classification. |  [optional]
**ticker** | **String** | The primary stock ticker symbol of the company. |  [optional]
**l1Id** | **BigDecimal** | The RBICS ID for the Level 1 (Economy) classification. |  [optional]
**l1Name** | **String** | The descriptive name for the Level 1 (Economy) classification. |  [optional]
**l2Id** | **BigDecimal** | The RBICS ID for the Level 2 (Sector) classification. |  [optional]
**l2Name** | **String** | The descriptive name for the Level 2 (Sector) classification. |  [optional]
**l3Id** | **BigDecimal** | The RBICS ID for the Level 3 (Sub-Sector) classification. |  [optional]
**l3Name** | **String** | The descriptive name for the Level 3 (Sub-Sector) classification. |  [optional]
**l4Id** | **BigDecimal** | The RBICS ID for the Level 4 (Industry Group) classification. |  [optional]
**l4Name** | **String** | The descriptive name for the Level 4 (Industry Group) classification. |  [optional]
**l5Id** | **BigDecimal** | The RBICS ID for the Level 5 (Industry) classification. |  [optional]
**l5Name** | **String** | The descriptive name for the Level 5 (Industry) classification. |  [optional]
**l6Id** | **BigDecimal** | The RBICS ID for the Level 6 (Sub-Industry) classification. |  [optional]
**l6Name** | **String** | The descriptive name for the Level 6 (Sub-Industry) classification. |  [optional]
**error** | [**ErrorObjectResponse**](ErrorObjectResponse.md) |  |  [optional]


## Implemented Interfaces

* Serializable


