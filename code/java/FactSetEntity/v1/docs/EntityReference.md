

# EntityReference


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | Unique FactSet-generated identifier representing an entity for the current entity identifier (-E) |  [optional]
**entityProperName** | **String** | Name that the entity is commonly referred to as, normalized and in proper case. |  [optional]
**fsymEntityId** | **String** | Unique FactSet-generated identifier representing an entity |  [optional]
**ultimateParentId** | **String** | The ultimate parent id of the entity. |  [optional]
**ultimateParentName** | **String** | Name that the ultimate parent entity is commonly referred to as, normalized and in proper case.\&quot; |  [optional]
**creditParentId** | **String** | The credit parent id in which issues debt instruments. The credit parent differs from the ultimate parent if the ultimate parent does not inherit the credit risk associated with an issuer&#39;s debt offerings. Credit Parent&#39;s are not Assigned to the Extinct Issues, Governments, Asset-Backed Securities, Trusts, Foundations, Private Equity, Venture Capital, Hedge Funds, or Mutual Funds. FactSet assigns credit parents based on the following methodology - * If an issuer (entity A) is considered a direct subsidiary of another entity (entity B), where the parent entity (entity B) has a 100% controlling interest in the issuer (entity A), then the parent entity (entity B) is considered the credit parent. * If an operating business is purchased as a portfolio company/operating company (entity A) by a group of private equity firms that establish a holding company (entity B) structure to reflect the collective ownership, and the portfolio company/operating company (entity A) issues debt as part of acquisition financing, then the portfolio company/operating company (entity A) is deemed to be the credit parent, not the holding company (entity B). * An issuer must have active debt.  |  [optional]
**parentEquityId** | **String** | The regional parent equity listing id. |  [optional]
**privateEntityFlag** | **Integer** | Returns 1 if the entity is a Private Company, otherwise, 0. |  [optional]
**publicEntityFlag** | **Integer** | Returns 1 if the entity is a Public Company, otherwise, 0. |  [optional]
**securityType** | **String** | Security type of the identifier, For descriptions of the each security type, visit [OA 15776](https://my.apps.factset.com/oa/pages/15776) |  [optional]
**website** | **String** | Web page address for the entity |  [optional]
**incorporationDate** | **LocalDate** | Year the entity was incorporated in YYYY-MM-DD format. |  [optional]
**countryOfRisk** | **String** | Entity&#39;s Country of Risk. FactSet has a determined methodology for assigning a country of risk to public and private entities, based on the following - * Country of Headquarters * Country of Incorporation * Country of Primary Exchange (the country where most liquid equity listings trade)  |  [optional]
**countryOfRiskGeoRev** | **String** | Entity&#39;s Country of Risk based on the Top Geograghic Revenue.  |  [optional]
**incorporationCountry** | **String** | ISO Country code where the entity is incorporated |  [optional]
**businessDescription** | **String** | Extended business description for the requested entity. |  [optional]
**phone** | **String** | The entity&#39;s international phone number. |  [optional]
**headquartersStreet** | **String** | The entity&#39;s headquarters street address. |  [optional]
**headquartersCity** | **String** | The entity&#39;s headquarters street address. |  [optional]
**headquartersState** | **String** | Abbreviated State of company headquarters. |  [optional]
**headquartersZip** | **String** | Zip/Postal Code for entity&#39;s headquarters. |  [optional]
**headquartersCountry** | **String** | Abbreviated (ISO) Country of headquarters. |  [optional]
**emailIR** | **String** | Email Address of the Investor Relations Contact |  [optional]
**websiteIR** | **String** | Website or Page for the Entity&#39;s Investor Relations team. |  [optional]
**requestId** | **String** | Identifier used in \&quot;ids\&quot; parameter.  When list of identifiers used, they will be parsed and resolved individually. |  [optional]


## Implemented Interfaces

* Serializable


