

# FilingUCC1

A single UCC-1 financing statement record.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | The identifier as submitted in the request (e.g., ticker or entity ID) |  [optional]
**vendorFilingId** | **String** | Vendor filing identifier. Format varies by state. |  [optional]
**debtorName** | **String** | Name of the party granting security interest. |  [optional]
**filingState** | **String** | US state code where the UCC-1 was filed. |  [optional]
**effectiveDate** | **LocalDate** | Date when the financing statement becomes effective. |  [optional]
**expirationDate** | **LocalDate** | Date when the financing statement expires (typically 5 years from effective date). |  [optional]
**entityProperName** | **String** | Institution legal name |  [optional]
**factsetEntityId** | **String** | FactSet entity identifier |  [optional]


## Implemented Interfaces

* Serializable


