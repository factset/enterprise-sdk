/**
 * FactSet Concordance API
 *   The FactSet Concordance API enables Application Developers and Data Scientists to programmatically discover the FactSet Identifier for a specific Entity or Person based on attributes, such as name, URL, and location.FactSet Identifiers are mapped to industry-standard identifiers, as well as to a comprehensive set of reference data and unique content, to enhance the ability to quickly connect content sets.<p>     Using the submitted attributes, the FactSet Concordance API leverages FactSet’s extensive Entity Master, People, and Symbology databases to return potential candidate matches and a proposed match. The result is a concorded FactSet Identifier that can then be used as input throughout FactSet's expanding catalog of Content using our Content APIs or Standard DataFeeds.</p>    <b>There are two types of workflows supported in the API:</b>    <b>Entity & People Match:</b> The first workflow follows traditional API conventions in that a request is accepted and a response is returned synchronously enabling the concordance of up to 25 names in a single request. The response returns a list of 20 candidates as well as a proposed match.    <b>Entity & People Match - Bulk:</b> The second workflow allows you to input a large list of names within a .CSV file in a single request With this workflow, a task is created for uploading a set of queries. Once the task has completed, the client retrieves the concordance results through the /entity-decisions or /people-decisions endpoint. Note that in the Bulk workflow, only the matches for the records are returned. Candidates are not included.    Once the service has provided a list of concorded FactSet Identifiers, you can then use our Entity Mappings and People Mappings endpoints to further review the universe of mapped identifiers or modify existing records. </p><p><b>Rate limit is set to 10 requests per second</b>.</p>    Methodology Guide link:   [https://open.factset.com/api/public/media/download/products/documents/8ca33e81-a7da-4d77-a8cf-2b3a2e868b3d](https://open.factset.com/api/public/media/download/products/documents/8ca33e81-a7da-4d77-a8cf-2b3a2e868b3d)    
 *
 * The version of the OpenAPI document: 2.8.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The EntityMatch model module.
 * @module model/EntityMatch
 */
class EntityMatch {
    /**
     * Constructs a new <code>EntityMatch</code>.
     * Entity Match object showing the decision reached for each Entity. 
     * @alias module:model/EntityMatch
     */
    constructor() { 
        
        EntityMatch.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>EntityMatch</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/EntityMatch} obj Optional instance to populate.
     * @return {module:model/EntityMatch} The populated <code>EntityMatch</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new EntityMatch();

            if (data.hasOwnProperty('taskId')) {
                obj['taskId'] = ApiClient.convertToType(data['taskId'], 'Number');
            }
            if (data.hasOwnProperty('universeId')) {
                obj['universeId'] = ApiClient.convertToType(data['universeId'], 'Number');
            }
            if (data.hasOwnProperty('clientId')) {
                obj['clientId'] = ApiClient.convertToType(data['clientId'], 'String');
            }
            if (data.hasOwnProperty('clientBbgFigi')) {
                obj['clientBbgFigi'] = ApiClient.convertToType(data['clientBbgFigi'], 'String');
            }
            if (data.hasOwnProperty('clientBbgTicker')) {
                obj['clientBbgTicker'] = ApiClient.convertToType(data['clientBbgTicker'], 'String');
            }
            if (data.hasOwnProperty('clientBic')) {
                obj['clientBic'] = ApiClient.convertToType(data['clientBic'], 'String');
            }
            if (data.hasOwnProperty('clientCik')) {
                obj['clientCik'] = ApiClient.convertToType(data['clientCik'], 'String');
            }
            if (data.hasOwnProperty('clientCountry')) {
                obj['clientCountry'] = ApiClient.convertToType(data['clientCountry'], 'String');
            }
            if (data.hasOwnProperty('clientCrd')) {
                obj['clientCrd'] = ApiClient.convertToType(data['clientCrd'], 'String');
            }
            if (data.hasOwnProperty('clientCusip')) {
                obj['clientCusip'] = ApiClient.convertToType(data['clientCusip'], 'String');
            }
            if (data.hasOwnProperty('clientDuns')) {
                obj['clientDuns'] = ApiClient.convertToType(data['clientDuns'], 'String');
            }
            if (data.hasOwnProperty('clientEin')) {
                obj['clientEin'] = ApiClient.convertToType(data['clientEin'], 'String');
            }
            if (data.hasOwnProperty('clientFactsetId')) {
                obj['clientFactsetId'] = ApiClient.convertToType(data['clientFactsetId'], 'String');
            }
            if (data.hasOwnProperty('clientFitch')) {
                obj['clientFitch'] = ApiClient.convertToType(data['clientFitch'], 'String');
            }
            if (data.hasOwnProperty('clientGvkey')) {
                obj['clientGvkey'] = ApiClient.convertToType(data['clientGvkey'], 'String');
            }
            if (data.hasOwnProperty('clientGvkeyIid')) {
                obj['clientGvkeyIid'] = ApiClient.convertToType(data['clientGvkeyIid'], 'String');
            }
            if (data.hasOwnProperty('clientIsin')) {
                obj['clientIsin'] = ApiClient.convertToType(data['clientIsin'], 'String');
            }
            if (data.hasOwnProperty('clientJcn')) {
                obj['clientJcn'] = ApiClient.convertToType(data['clientJcn'], 'String');
            }
            if (data.hasOwnProperty('clientLei')) {
                obj['clientLei'] = ApiClient.convertToType(data['clientLei'], 'String');
            }
            if (data.hasOwnProperty('clientLxid')) {
                obj['clientLxid'] = ApiClient.convertToType(data['clientLxid'], 'String');
            }
            if (data.hasOwnProperty('clientMd')) {
                obj['clientMd'] = ApiClient.convertToType(data['clientMd'], 'String');
            }
            if (data.hasOwnProperty('clientName')) {
                obj['clientName'] = ApiClient.convertToType(data['clientName'], 'String');
            }
            if (data.hasOwnProperty('clientPriority')) {
                obj['clientPriority'] = ApiClient.convertToType(data['clientPriority'], 'String');
            }
            if (data.hasOwnProperty('clientRedCode')) {
                obj['clientRedCode'] = ApiClient.convertToType(data['clientRedCode'], 'String');
            }
            if (data.hasOwnProperty('clientRssd')) {
                obj['clientRssd'] = ApiClient.convertToType(data['clientRssd'], 'String');
            }
            if (data.hasOwnProperty('clientSedol')) {
                obj['clientSedol'] = ApiClient.convertToType(data['clientSedol'], 'String');
            }
            if (data.hasOwnProperty('clientSpr')) {
                obj['clientSpr'] = ApiClient.convertToType(data['clientSpr'], 'String');
            }
            if (data.hasOwnProperty('clientState')) {
                obj['clientState'] = ApiClient.convertToType(data['clientState'], 'String');
            }
            if (data.hasOwnProperty('clientTicker')) {
                obj['clientTicker'] = ApiClient.convertToType(data['clientTicker'], 'String');
            }
            if (data.hasOwnProperty('clientTickerExchange')) {
                obj['clientTickerExchange'] = ApiClient.convertToType(data['clientTickerExchange'], 'String');
            }
            if (data.hasOwnProperty('clientTickerRegion')) {
                obj['clientTickerRegion'] = ApiClient.convertToType(data['clientTickerRegion'], 'String');
            }
            if (data.hasOwnProperty('clientUkch')) {
                obj['clientUkch'] = ApiClient.convertToType(data['clientUkch'], 'String');
            }
            if (data.hasOwnProperty('clientUrl')) {
                obj['clientUrl'] = ApiClient.convertToType(data['clientUrl'], 'String');
            }
            if (data.hasOwnProperty('clientValoren')) {
                obj['clientValoren'] = ApiClient.convertToType(data['clientValoren'], 'String');
            }
            if (data.hasOwnProperty('clientWkn')) {
                obj['clientWkn'] = ApiClient.convertToType(data['clientWkn'], 'String');
            }
            if (data.hasOwnProperty('clientAdditionalContext')) {
                obj['clientAdditionalContext'] = ApiClient.convertToType(data['clientAdditionalContext'], {'String': 'String'});
            }
            if (data.hasOwnProperty('symbolMatchType')) {
                obj['symbolMatchType'] = ApiClient.convertToType(data['symbolMatchType'], 'String');
            }
            if (data.hasOwnProperty('rowIndex')) {
                obj['rowIndex'] = ApiClient.convertToType(data['rowIndex'], 'Number');
            }
            if (data.hasOwnProperty('matchFlag')) {
                obj['matchFlag'] = ApiClient.convertToType(data['matchFlag'], 'Boolean');
            }
            if (data.hasOwnProperty('entityId')) {
                obj['entityId'] = ApiClient.convertToType(data['entityId'], 'String');
            }
            if (data.hasOwnProperty('entityName')) {
                obj['entityName'] = ApiClient.convertToType(data['entityName'], 'String');
            }
            if (data.hasOwnProperty('url')) {
                obj['url'] = ApiClient.convertToType(data['url'], 'String');
            }
            if (data.hasOwnProperty('mapStatus')) {
                obj['mapStatus'] = ApiClient.convertToType(data['mapStatus'], 'String');
            }
            if (data.hasOwnProperty('similarityScore')) {
                obj['similarityScore'] = ApiClient.convertToType(data['similarityScore'], 'Number');
            }
            if (data.hasOwnProperty('confidenceScore')) {
                obj['confidenceScore'] = ApiClient.convertToType(data['confidenceScore'], 'Number');
            }
            if (data.hasOwnProperty('countryCode')) {
                obj['countryCode'] = ApiClient.convertToType(data['countryCode'], 'String');
            }
            if (data.hasOwnProperty('countryName')) {
                obj['countryName'] = ApiClient.convertToType(data['countryName'], 'String');
            }
            if (data.hasOwnProperty('stateCode')) {
                obj['stateCode'] = ApiClient.convertToType(data['stateCode'], 'String');
            }
            if (data.hasOwnProperty('stateName')) {
                obj['stateName'] = ApiClient.convertToType(data['stateName'], 'String');
            }
            if (data.hasOwnProperty('sicCode')) {
                obj['sicCode'] = ApiClient.convertToType(data['sicCode'], 'String');
            }
            if (data.hasOwnProperty('entityTypeCode')) {
                obj['entityTypeCode'] = ApiClient.convertToType(data['entityTypeCode'], 'String');
            }
            if (data.hasOwnProperty('entityTypeDescription')) {
                obj['entityTypeDescription'] = ApiClient.convertToType(data['entityTypeDescription'], 'String');
            }
            if (data.hasOwnProperty('entitySubTypeCode')) {
                obj['entitySubTypeCode'] = ApiClient.convertToType(data['entitySubTypeCode'], 'String');
            }
            if (data.hasOwnProperty('locationCity')) {
                obj['locationCity'] = ApiClient.convertToType(data['locationCity'], 'String');
            }
            if (data.hasOwnProperty('regionName')) {
                obj['regionName'] = ApiClient.convertToType(data['regionName'], 'String');
            }
            if (data.hasOwnProperty('factsetIndustryCode')) {
                obj['factsetIndustryCode'] = ApiClient.convertToType(data['factsetIndustryCode'], 'String');
            }
            if (data.hasOwnProperty('factsetIndustryName')) {
                obj['factsetIndustryName'] = ApiClient.convertToType(data['factsetIndustryName'], 'String');
            }
            if (data.hasOwnProperty('factsetSectorCode')) {
                obj['factsetSectorCode'] = ApiClient.convertToType(data['factsetSectorCode'], 'String');
            }
            if (data.hasOwnProperty('factsetSectorName')) {
                obj['factsetSectorName'] = ApiClient.convertToType(data['factsetSectorName'], 'String');
            }
            if (data.hasOwnProperty('parentName')) {
                obj['parentName'] = ApiClient.convertToType(data['parentName'], 'String');
            }
            if (data.hasOwnProperty('parentMatchFlag')) {
                obj['parentMatchFlag'] = ApiClient.convertToType(data['parentMatchFlag'], 'Boolean');
            }
            if (data.hasOwnProperty('nameMatchString')) {
                obj['nameMatchString'] = ApiClient.convertToType(data['nameMatchString'], 'String');
            }
            if (data.hasOwnProperty('nameMatchSource')) {
                obj['nameMatchSource'] = ApiClient.convertToType(data['nameMatchSource'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Identifier denoting a specific Concordance task submitted by the user. This value will be null for /entity-match endpoint responses and is only available when using the \"Bulk\" workflow. 
 * @member {Number} taskId
 */
EntityMatch.prototype['taskId'] = undefined;

/**
 * The id of the universe that entities should be mapped to
 * @member {Number} universeId
 */
EntityMatch.prototype['universeId'] = undefined;

/**
 * Unique Identifer provided by the user in the request to represent the entity Name being requested.
 * @member {String} clientId
 */
EntityMatch.prototype['clientId'] = undefined;

/**
 * Name of the column as provided by the user -  Bloomberg Listing/Regional/Security ID.
 * @member {String} clientBbgFigi
 */
EntityMatch.prototype['clientBbgFigi'] = undefined;

/**
 * Name of the column as provided by the user -  Bloomberg Listing and Regional Ticker.
 * @member {String} clientBbgTicker
 */
EntityMatch.prototype['clientBbgTicker'] = undefined;

/**
 * Name of the column as provided by the user - BICCode, bank indentification code
 * @member {String} clientBic
 */
EntityMatch.prototype['clientBic'] = undefined;

/**
 * Name of the column as provided by the user -  CIK, Edgar Central Index Keys
 * @member {String} clientCik
 */
EntityMatch.prototype['clientCik'] = undefined;

/**
 * ISO2 country code specified in the request.
 * @member {String} clientCountry
 */
EntityMatch.prototype['clientCountry'] = undefined;

/**
 * Name of the column as provided by the user -  CRD, Central Registration Depository
 * @member {String} clientCrd
 */
EntityMatch.prototype['clientCrd'] = undefined;

/**
 * Name of the column as provided by the user -  CUSIP.
 * @member {String} clientCusip
 */
EntityMatch.prototype['clientCusip'] = undefined;

/**
 * Name of the column as provided by the user -  DUNS, Dun&Bradstreet.
 * @member {String} clientDuns
 */
EntityMatch.prototype['clientDuns'] = undefined;

/**
 * Name of the column as provided by the user -  EmployerIdentificationNumber, EIN.
 * @member {String} clientEin
 */
EntityMatch.prototype['clientEin'] = undefined;

/**
 * Name of the column as provided by the user -  FactSet Identifier, FactSet -E,-S,-R, -L Permanent Identifier.
 * @member {String} clientFactsetId
 */
EntityMatch.prototype['clientFactsetId'] = undefined;

/**
 * Name of the column as provided by the user -  FitchCreditRating, Fitch Ratings Identifier.
 * @member {String} clientFitch
 */
EntityMatch.prototype['clientFitch'] = undefined;

/**
 * Name of the column as provided by the user -  GVKEY, Compustat Global Company Key.
 * @member {String} clientGvkey
 */
EntityMatch.prototype['clientGvkey'] = undefined;

/**
 * Name of the column as provided by the user -  GVKEY+IID, Compustat Global Company Key and Issue Identifier.
 * @member {String} clientGvkeyIid
 */
EntityMatch.prototype['clientGvkeyIid'] = undefined;

/**
 * Name of the column as provided by the user -  ISIN.
 * @member {String} clientIsin
 */
EntityMatch.prototype['clientIsin'] = undefined;

/**
 * Name of the column as provided by the user -  JCN , Japanese Corporate Number.
 * @member {String} clientJcn
 */
EntityMatch.prototype['clientJcn'] = undefined;

/**
 * Name of the column as provided by the user -  LegalEntityIdentifier, LEI.
 * @member {String} clientLei
 */
EntityMatch.prototype['clientLei'] = undefined;

/**
 * Name of the column as provided by the user -  LXID, Markit Syndicated Loan Identifier.
 * @member {String} clientLxid
 */
EntityMatch.prototype['clientLxid'] = undefined;

/**
 * Name of the column as provided by the user -  MoodysIssuer, Moody's Ratings Identifier.
 * @member {String} clientMd
 */
EntityMatch.prototype['clientMd'] = undefined;

/**
 * Name of the entity to match as specified in the request
 * @member {String} clientName
 */
EntityMatch.prototype['clientName'] = undefined;

/**
 * Name of the priority column as provided by the user.
 * @member {String} clientPriority
 */
EntityMatch.prototype['clientPriority'] = undefined;

/**
 * Name of the column as provided by the user -  RedCode, Markit Reference Entity Identifier.
 * @member {String} clientRedCode
 */
EntityMatch.prototype['clientRedCode'] = undefined;

/**
 * Name of the column as provided by the user -  FederalReserveRSSDIdentifier, RSSD.
 * @member {String} clientRssd
 */
EntityMatch.prototype['clientRssd'] = undefined;

/**
 * Name of the column as provided by the user -  SEDOL.
 * @member {String} clientSedol
 */
EntityMatch.prototype['clientSedol'] = undefined;

/**
 * Name of the column as provided by the user -  S&PRating, S&P Ratings Identifier.
 * @member {String} clientSpr
 */
EntityMatch.prototype['clientSpr'] = undefined;

/**
 * State code specified in the request.
 * @member {String} clientState
 */
EntityMatch.prototype['clientState'] = undefined;

/**
 * Name of the column as provided by the user -  PriceTicker.
 * @member {String} clientTicker
 */
EntityMatch.prototype['clientTicker'] = undefined;

/**
 * Name of the column as provided by the user -  TickerExch.
 * @member {String} clientTickerExchange
 */
EntityMatch.prototype['clientTickerExchange'] = undefined;

/**
 * Name of the column as provided by the user -  TickerRegion
 * @member {String} clientTickerRegion
 */
EntityMatch.prototype['clientTickerRegion'] = undefined;

/**
 * Name of the column as provided by the user -  UKCompanyHouse
 * @member {String} clientUkch
 */
EntityMatch.prototype['clientUkch'] = undefined;

/**
 * URL specified in the request.
 * @member {String} clientUrl
 */
EntityMatch.prototype['clientUrl'] = undefined;

/**
 * Name of the column as provided by the user -  VALOR, Valoren (\"Valor\") Identification.
 * @member {String} clientValoren
 */
EntityMatch.prototype['clientValoren'] = undefined;

/**
 * Name of the column as provided by the user -  WKN, German Securities Identification.
 * @member {String} clientWkn
 */
EntityMatch.prototype['clientWkn'] = undefined;

/**
 * Any additional context column along with their values in the input file or single search.  To be used by Managed Service for any unmapped records. 
 * @member {Object.<String, String>} clientAdditionalContext
 */
EntityMatch.prototype['clientAdditionalContext'] = undefined;

/**
 * Source type of the Symbol that matched
 * @member {String} symbolMatchType
 */
EntityMatch.prototype['symbolMatchType'] = undefined;

/**
 * Row number for match in the request or input file.
 * @member {Number} rowIndex
 */
EntityMatch.prototype['rowIndex'] = undefined;

/**
 * Flag denoting if the row is a match.
 * @member {Boolean} matchFlag
 */
EntityMatch.prototype['matchFlag'] = undefined;

/**
 * FactSet Entity Identifier of the entity matched respective to the requested Name submitted. For more detail, visit [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881) 
 * @member {String} entityId
 */
EntityMatch.prototype['entityId'] = undefined;

/**
 * Full name corresponding to the matched entity.
 * @member {String} entityName
 */
EntityMatch.prototype['entityName'] = undefined;

/**
 * URL of the matched entity.
 * @member {String} url
 */
EntityMatch.prototype['url'] = undefined;

/**
 * Concordance status of the submitted, where -    * MAPPED - The requested Entity Name is successfully mapped to a FactSet Entity Id (-E)   * UNMAPPED - The requested Entity Name is unmapped by FactSet.   * INDETERMINATE - The requested Entity Name has unable to make a mapping. 
 * @member {module:model/EntityMatch.MapStatusEnum} mapStatus
 */
EntityMatch.prototype['mapStatus'] = undefined;

/**
 * Probability of the match being similar to the entity requested as determined by the Concordance algorithm. A similarityScore of 1 is the highest level of similarity. 
 * @member {Number} similarityScore
 */
EntityMatch.prototype['similarityScore'] = undefined;

/**
 * Additional statistic calculated by the algorithm that is used to ensure the validity of the match result. A confidenceScore of 1 is the highest level of confidence. 
 * @member {Number} confidenceScore
 */
EntityMatch.prototype['confidenceScore'] = undefined;

/**
 * ISO2 country code corresponding to the location of the matched entity.
 * @member {String} countryCode
 */
EntityMatch.prototype['countryCode'] = undefined;

/**
 * Country name corresponding to the location of the matched entity
 * @member {String} countryName
 */
EntityMatch.prototype['countryName'] = undefined;

/**
 * Two character state code corresponding to the location of the matched entity.
 * @member {String} stateCode
 */
EntityMatch.prototype['stateCode'] = undefined;

/**
 * State name corresponding to the location of the matched entity.
 * @member {String} stateName
 */
EntityMatch.prototype['stateName'] = undefined;

/**
 * Standard Industrial Classification (SIC) Code of the matched entity.
 * @member {String} sicCode
 */
EntityMatch.prototype['sicCode'] = undefined;

/**
 * Code representing the entity type of the matched entity. See the related request parameter for a table of all Codes and their respective descriptions.
 * @member {String} entityTypeCode
 */
EntityMatch.prototype['entityTypeCode'] = undefined;

/**
 * Description of of the matched entity's type.
 * @member {String} entityTypeDescription
 */
EntityMatch.prototype['entityTypeDescription'] = undefined;

/**
 * Code representing the entity subtype of the matched entity. See the related request parameter for a table of all Codes and their respective descriptions.
 * @member {String} entitySubTypeCode
 */
EntityMatch.prototype['entitySubTypeCode'] = undefined;

/**
 * City where the matched entity is located.
 * @member {String} locationCity
 */
EntityMatch.prototype['locationCity'] = undefined;

/**
 * Region where the matched entity is located.
 * @member {String} regionName
 */
EntityMatch.prototype['regionName'] = undefined;

/**
 * FactSet Industry Classification Code of the matched entity.
 * @member {String} factsetIndustryCode
 */
EntityMatch.prototype['factsetIndustryCode'] = undefined;

/**
 * Name of the matched entity's FactSet Industry Classification.
 * @member {String} factsetIndustryName
 */
EntityMatch.prototype['factsetIndustryName'] = undefined;

/**
 * Name of the matched entity's FactSet Sector Classification Code.
 * @member {String} factsetSectorCode
 */
EntityMatch.prototype['factsetSectorCode'] = undefined;

/**
 * Name of the matched entity's FactSet Sector Classification.
 * @member {String} factsetSectorName
 */
EntityMatch.prototype['factsetSectorName'] = undefined;

/**
 * Name of the matched entity's parent entity.
 * @member {String} parentName
 */
EntityMatch.prototype['parentName'] = undefined;

/**
 * Flag denoting that the matched entity is the parent of another match.
 * @member {Boolean} parentMatchFlag
 */
EntityMatch.prototype['parentMatchFlag'] = undefined;

/**
 * String on which the Concordance algorithm mapped the submitted entity.
 * @member {String} nameMatchString
 */
EntityMatch.prototype['nameMatchString'] = undefined;

/**
 * Type of name that the nameMatchString matched.
 * @member {String} nameMatchSource
 */
EntityMatch.prototype['nameMatchSource'] = undefined;





/**
 * Allowed values for the <code>mapStatus</code> property.
 * @enum {String}
 * @readonly
 */
EntityMatch['MapStatusEnum'] = {

    /**
     * value: "MAPPED"
     * @const
     */
    "MAPPED": "MAPPED",

    /**
     * value: "UNMAPPED"
     * @const
     */
    "UNMAPPED": "UNMAPPED",

    /**
     * value: "INDETERMINATE"
     * @const
     */
    "INDETERMINATE": "INDETERMINATE"
};



export default EntityMatch;

