/**
 * FactSet Concordance API
 * The FactSet Concordance API provides the ability to programmatically look up several types of entities by their name and other attributes. It attempts to match attributes that you supply for the entity and returns as many match candidates as it can find. The result is a \"concorded\" FactSet Entity Permanent identifier.  The Entity Identifier can then be used as input throughout FactSet's Content soultions, such as Content APIs and Standard DataFeeds.<p> There are two types of workflows supported in the API. The first workflow type follows traditional API conventions in that a request is accepted and a response is returned synchronously. The second workflow type involves a background task. With this workflow, a task is created for uploading a set of queries, and then the client polls for the task to complete. Once the task has completed, the client retrieves the concordance results throught the decisions endpoint.</p> 
 *
 * The version of the OpenAPI document: 2.4.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The CreateUniverseRequest model module.
 * @module model/CreateUniverseRequest
 */
class CreateUniverseRequest {
    /**
     * Constructs a new <code>CreateUniverseRequest</code>.
     * @alias module:model/CreateUniverseRequest
     * @param universeName {String} Universe name
     */
    constructor(universeName) { 
        
        CreateUniverseRequest.initialize(this, universeName);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, universeName) { 
        obj['universeName'] = universeName;
    }

    /**
     * Constructs a <code>CreateUniverseRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CreateUniverseRequest} obj Optional instance to populate.
     * @return {module:model/CreateUniverseRequest} The populated <code>CreateUniverseRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CreateUniverseRequest();

            if (data.hasOwnProperty('universeName')) {
                obj['universeName'] = ApiClient.convertToType(data['universeName'], 'String');
            }
            if (data.hasOwnProperty('universeDescription')) {
                obj['universeDescription'] = ApiClient.convertToType(data['universeDescription'], 'String');
            }
            if (data.hasOwnProperty('universeType')) {
                obj['universeType'] = ApiClient.convertToType(data['universeType'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Universe name
 * @member {String} universeName
 */
CreateUniverseRequest.prototype['universeName'] = undefined;

/**
 * Universe description
 * @member {String} universeDescription
 */
CreateUniverseRequest.prototype['universeDescription'] = undefined;

/**
 * Universe type
 * @member {String} universeType
 */
CreateUniverseRequest.prototype['universeType'] = undefined;






export default CreateUniverseRequest;

