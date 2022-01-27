# EntityReference


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsym_id** | **str** | Unique FactSet-generated identifier representing an entity for the current entity identifier (-E) | [optional] 
**entity_proper_name** | **str** | Name that the entity is commonly referred to as, normalized and in proper case. | [optional] 
**fsym_entity_id** | **str** | Unique FactSet-generated identifier representing an entity | [optional] 
**ultimate_parent_id** | **str** | The ultimate parent id of the entity. | [optional] 
**ultimate_parent_name** | **str** | Name that the ultimate parent entity is commonly referred to as, normalized and in proper case.\&quot; | [optional] 
**credit_parent_id** | **str** | The credit parent id in which issues debt instruments. The credit parent differs from the ultimate parent if the ultimate parent does not inherit the credit risk associated with an issuer&#39;s debt offerings. Credit Parent&#39;s are not Assigned to the Extinct Issues, Governments, Asset-Backed Securities, Trusts, Foundations, Private Equity, Venture Capital, Hedge Funds, or Mutual Funds. FactSet assigns credit parents based on the following methodology - * If an issuer (entity A) is considered a direct subsidiary of another entity (entity B), where the parent entity (entity B) has a 100% controlling interest in the issuer (entity A), then the parent entity (entity B) is considered the credit parent. * If an operating business is purchased as a portfolio company/operating company (entity A) by a group of private equity firms that establish a holding company (entity B) structure to reflect the collective ownership, and the portfolio company/operating company (entity A) issues debt as part of acquisition financing, then the portfolio company/operating company (entity A) is deemed to be the credit parent, not the holding company (entity B). * An issuer must have active debt.  | [optional] 
**parent_equity_id** | **str** | The regional parent equity listing id. | [optional] 
**private_entity_flag** | **int** | Returns 1 if the entity is a Private Company, otherwise, 0. | [optional] 
**public_entity_flag** | **int** | Returns 1 if the entity is a Public Company, otherwise, 0. | [optional] 
**security_type** | **str** | Security type of the identifier, For descriptions of the each security type, visit [OA 15776](https://my.apps.factset.com/oa/pages/15776) | [optional] 
**website** | **str** | Web page address for the entity | [optional] 
**incorporation_date** | **date** | Year the entity was incorporated in YYYY-MM-DD format. | [optional] 
**country_of_risk** | **str** | Entity&#39;s Country of Risk. FactSet has a determined methodology for assigning a country of risk to public and private entities, based on the following - * Country of Headquarters * Country of Incorporation * Country of Primary Exchange (the country where most liquid equity listings trade)  | [optional] 
**incorporation_country** | **str** | ISO Country code where the entity is incorporated | [optional] 
**business_description** | **str** | Extended business description for the requested entity. | [optional] 
**phone** | **str** | The entity&#39;s international phone number. | [optional] 
**headquarters_street** | **str** | The entity&#39;s headquarters street address. | [optional] 
**headquarters_city** | **str** | The entity&#39;s headquarters street address. | [optional] 
**headquarters_state** | **str** | Abbreviated State of company headquarters. | [optional] 
**headquarters_zip** | **str** | Zip/Postal Code for entity&#39;s headquarters. | [optional] 
**headquarters_country** | **str** | Abbreviated (ISO) Country of headquarters. | [optional] 
**email_ir** | **str** | Email Address of the Investor Relations Contact | [optional] 
**website_ir** | **str** | Website or Page for the Entity&#39;s Investor Relations team. | [optional] 
**request_id** | **str** | Identifier used in \&quot;ids\&quot; parameter.  When list of identifiers used, they will be parsed and resolved individually. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


