/**
 * Company Logo API For Digital Portals
 * Consume FactSet-collected company logos through an API that seamlessly integrates with company fundamentals and estimates data (listed equities data available via the stocks API), quotes, time series, and other Functional APIs.
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The InlineResponse200DataVector model module.
 * @module model/InlineResponse200DataVector
 * @version 0.10.0
 */
class InlineResponse200DataVector {
    /**
     * Constructs a new <code>InlineResponse200DataVector</code>.
     * Vector logo.
     * @alias module:model/InlineResponse200DataVector
     */
    constructor() { 
        
        InlineResponse200DataVector.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse200DataVector</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse200DataVector} obj Optional instance to populate.
     * @return {module:model/InlineResponse200DataVector} The populated <code>InlineResponse200DataVector</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse200DataVector();

            if (data.hasOwnProperty('url')) {
                obj['url'] = ApiClient.convertToType(data['url'], 'String');
            }
            if (data.hasOwnProperty('mimeType')) {
                obj['mimeType'] = ApiClient.convertToType(data['mimeType'], 'String');
            }
        }
        return obj;
    }


}

/**
 * URL of the logo.
 * @member {String} url
 */
InlineResponse200DataVector.prototype['url'] = undefined;

/**
 * MIME type of the logo.
 * @member {String} mimeType
 */
InlineResponse200DataVector.prototype['mimeType'] = undefined;






export default InlineResponse200DataVector;
