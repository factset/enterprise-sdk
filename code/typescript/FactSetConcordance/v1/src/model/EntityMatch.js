/**
 * FactSet Concordance API
 * The FactSet Concordance API provides the ability to programmatically look up several types of entities by their name and other attributes. It attempts to match attributes that you supply for the entity and returns as many match candidates as it can find. The result is a \"concorded\" FactSet Entity Permanent identifier.  The Entity Identifier can then be used as input throughout FactSet's Content soultions, such as Content APIs and Standard DataFeeds.<p> There are types of workflows supported in the API. The first workflow type follows traditional API conventions in that a request is accepted and a response is returned synchronously. The second workflow type involves a background task. With this workflow, a task is created for uploading a set of queries, and then the client polls for the task to complete. Once the task has completed, the client retrieves the concordance results throught the decisions endpoint.</p> 
 *
 * The version of the OpenAPI document: 1.1.0
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
            if (data.hasOwnProperty('clientId')) {
                obj['clientId'] = ApiClient.convertToType(data['clientId'], 'String');
            }
            if (data.hasOwnProperty('clientName')) {
                obj['clientName'] = ApiClient.convertToType(data['clientName'], 'String');
            }
            if (data.hasOwnProperty('clientCountry')) {
                obj['clientCountry'] = ApiClient.convertToType(data['clientCountry'], 'String');
            }
            if (data.hasOwnProperty('clientState')) {
                obj['clientState'] = ApiClient.convertToType(data['clientState'], 'String');
            }
            if (data.hasOwnProperty('clientUrl')) {
                obj['clientUrl'] = ApiClient.convertToType(data['clientUrl'], 'String');
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
 * Unique Identifer provided by the user in the request to represent the entity Name being requested.
 * @member {String} clientId
 */
EntityMatch.prototype['clientId'] = undefined;

/**
 * Name of the entity to match as specified in the request
 * @member {String} clientName
 */
EntityMatch.prototype['clientName'] = undefined;

/**
 * ISO2 country code specified in the request.
 * @member {String} clientCountry
 */
EntityMatch.prototype['clientCountry'] = undefined;

/**
 * State code specified in the request.
 * @member {String} clientState
 */
EntityMatch.prototype['clientState'] = undefined;

/**
 * URL specified in the request.
 * @member {String} clientUrl
 */
EntityMatch.prototype['clientUrl'] = undefined;

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

