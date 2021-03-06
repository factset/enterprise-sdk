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
 * The EntityMapping model module.
 * @module model/EntityMapping
 */
class EntityMapping {
    /**
     * Constructs a new <code>EntityMapping</code>.
     * Concordance Company Entity Mapping object. Shows the mapping detail related to user&#39;s universe. 
     * @alias module:model/EntityMapping
     */
    constructor() { 
        
        EntityMapping.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>EntityMapping</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/EntityMapping} obj Optional instance to populate.
     * @return {module:model/EntityMapping} The populated <code>EntityMapping</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new EntityMapping();

            if (data.hasOwnProperty('entityId')) {
                obj['entityId'] = ApiClient.convertToType(data['entityId'], 'String');
            }
            if (data.hasOwnProperty('entityName')) {
                obj['entityName'] = ApiClient.convertToType(data['entityName'], 'String');
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
            if (data.hasOwnProperty('createdTime')) {
                obj['createdTime'] = ApiClient.convertToType(data['createdTime'], 'Date');
            }
            if (data.hasOwnProperty('updatedTime')) {
                obj['updatedTime'] = ApiClient.convertToType(data['updatedTime'], 'Date');
            }
            if (data.hasOwnProperty('mapStatus')) {
                obj['mapStatus'] = ApiClient.convertToType(data['mapStatus'], 'String');
            }
        }
        return obj;
    }


}

/**
 * FactSet Entity Identifier of the entity matched to the submitted entity
 * @member {String} entityId
 */
EntityMapping.prototype['entityId'] = undefined;

/**
 * Full name corresponding to the matched entity.
 * @member {String} entityName
 */
EntityMapping.prototype['entityName'] = undefined;

/**
 * User-defined unique identifier provided by the user in the request
 * @member {String} clientId
 */
EntityMapping.prototype['clientId'] = undefined;

/**
 * Name of the entity to match as specified in the request.
 * @member {String} clientName
 */
EntityMapping.prototype['clientName'] = undefined;

/**
 * ISO2 country code specified in the request
 * @member {String} clientCountry
 */
EntityMapping.prototype['clientCountry'] = undefined;

/**
 * State code specified in the request
 * @member {String} clientState
 */
EntityMapping.prototype['clientState'] = undefined;

/**
 * URL specified in the request
 * @member {String} clientUrl
 */
EntityMapping.prototype['clientUrl'] = undefined;

/**
 * Time when entity was created in UTC.
 * @member {Date} createdTime
 */
EntityMapping.prototype['createdTime'] = undefined;

/**
 * Time when the submitted entity was last updated in UTC.
 * @member {Date} updatedTime
 */
EntityMapping.prototype['updatedTime'] = undefined;

/**
 * Current status of the entity mapping.
 * @member {module:model/EntityMapping.MapStatusEnum} mapStatus
 */
EntityMapping.prototype['mapStatus'] = undefined;





/**
 * Allowed values for the <code>mapStatus</code> property.
 * @enum {String}
 * @readonly
 */
EntityMapping['MapStatusEnum'] = {

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



export default EntityMapping;

