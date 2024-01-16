/**
 * Global Filings API
 * The Filings API provides a comprehensive set of functionalities for searching and retrieving filing documents from various sources.  This API is designed to expose document search and document retrieval functionality. A document search will allow a request to query FactSet’s document databases based on certain search criteria specified in the request.  In addition, a document count request will provide information on the number of stories available for a particular security.  Helper endpoint will provide dynamic information on the parameters of a document request. .
 *
 * The version of the OpenAPI document: 0.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The ResponseHelperObjectCategoriesObject model module.
 * @module model/ResponseHelperObjectCategoriesObject
 */
class ResponseHelperObjectCategoriesObject {
    /**
     * Constructs a new <code>ResponseHelperObjectCategoriesObject</code>.
     * @alias module:model/ResponseHelperObjectCategoriesObject
     */
    constructor() { 
        
        ResponseHelperObjectCategoriesObject.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ResponseHelperObjectCategoriesObject</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ResponseHelperObjectCategoriesObject} obj Optional instance to populate.
     * @return {module:model/ResponseHelperObjectCategoriesObject} The populated <code>ResponseHelperObjectCategoriesObject</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ResponseHelperObjectCategoriesObject();

            if (data.hasOwnProperty('subject')) {
                obj['subject'] = ApiClient.convertToType(data['subject'], 'String');
            }
            if (data.hasOwnProperty('category')) {
                obj['category'] = ApiClient.convertToType(data['category'], 'String');
            }
            if (data.hasOwnProperty('description')) {
                obj['description'] = ApiClient.convertToType(data['description'], 'String');
            }
        }
        return obj;
    }


}

/**
 * subject code
 * @member {String} subject
 */
ResponseHelperObjectCategoriesObject.prototype['subject'] = undefined;

/**
 * category
 * @member {String} category
 */
ResponseHelperObjectCategoriesObject.prototype['category'] = undefined;

/**
 * description
 * @member {String} description
 */
ResponseHelperObjectCategoriesObject.prototype['description'] = undefined;






export default ResponseHelperObjectCategoriesObject;

