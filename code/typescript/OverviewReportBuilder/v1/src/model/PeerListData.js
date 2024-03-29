/**
 * FactSet Overview Report Builder API
 * Get relevant industry-specific data for high level analysis of public and private companies
 *
 * The version of the OpenAPI document: 1.2.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The PeerListData model module.
 * @module model/PeerListData
 */
class PeerListData {
    /**
     * Constructs a new <code>PeerListData</code>.
     * @alias module:model/PeerListData
     * @param id {String} The FactSet Entity ID of the peer
     * @param name {String} The name of the peer
     * @param ticker {String} The ticker of the peer
     */
    constructor(id, name, ticker) { 
        
        PeerListData.initialize(this, id, name, ticker);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, id, name, ticker) { 
        obj['id'] = id;
        obj['name'] = name;
        obj['ticker'] = ticker;
    }

    /**
     * Constructs a <code>PeerListData</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PeerListData} obj Optional instance to populate.
     * @return {module:model/PeerListData} The populated <code>PeerListData</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PeerListData();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('ticker')) {
                obj['ticker'] = ApiClient.convertToType(data['ticker'], 'String');
            }
        }
        return obj;
    }


}

/**
 * The FactSet Entity ID of the peer
 * @member {String} id
 */
PeerListData.prototype['id'] = undefined;

/**
 * The name of the peer
 * @member {String} name
 */
PeerListData.prototype['name'] = undefined;

/**
 * The ticker of the peer
 * @member {String} ticker
 */
PeerListData.prototype['ticker'] = undefined;






export default PeerListData;

