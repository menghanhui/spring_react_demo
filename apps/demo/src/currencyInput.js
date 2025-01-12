import React, {Component} from 'react'
import CurrencyInput from 'react-currency-input';

// var createReactClass = require('create-react-class');

export default class currencyInput extends Component{
    getInitialState(){
        return ({amount: "0.00"});
    }

    handleChange(event, maskedvalue, floatvalue){
        this.setState({amount: maskedvalue});
    }

    render() {
        return (
            <div>
                <CurrencyInput value={this.state.amount} onChangeEvent={this.handleChange}/>
            </div>
        );
    }
};

// export default currencyInput