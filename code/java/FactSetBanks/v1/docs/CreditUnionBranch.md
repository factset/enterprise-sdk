

# CreditUnionBranch

A single US credit union branch or ATM location record.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | Request identifier |  [optional]
**factsetEntityId** | **String** | FactSet entity identifier |  [optional]
**entityProperName** | **String** | Institution legal name |  [optional]
**coverage** | **CreditUnionCoverage** |  | 
**branchSite** | **String** | Branch site name |  [optional]
**atmSite** | **String** | ATM site name |  [optional]
**isMainOffice** | **Boolean** | Main office flag |  [optional]
**hasMemberServices** | **Boolean** | Has member services flag |  [optional]
**hasAtm** | **Boolean** | Has ATM on-site flag |  [optional]
**hasDriveThru** | **Boolean** | Has drive-thru service flag |  [optional]
**addressId** | **Integer** | Unique address identifier |  [optional]
**siteType** | [**SiteTypeEnum**](#SiteTypeEnum) | Type of site |  [optional]
**locationCity** | **String** | City name |  [optional]
**stateProvince** | **String** | US state 2-letter code |  [optional]
**locationPostalCode** | **String** | ZIP code |  [optional]
**locationStreet** | **String** | Street address |  [optional]
**isoCountry** | **String** | ISO country code |  [optional]
**latitude** | **Double** | Latitude coordinate |  [optional]
**longitude** | **Double** | Longitude coordinate |  [optional]



## Enum: SiteTypeEnum

Name | Value
---- | -----
BRANCH_OFFICE | &quot;BRANCH_OFFICE&quot;
CORPORATE_OFFICE | &quot;CORPORATE_OFFICE&quot;
OTHER | &quot;OTHER&quot;


## Implemented Interfaces

* Serializable


