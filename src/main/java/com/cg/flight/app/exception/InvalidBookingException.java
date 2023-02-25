package com.cg.flight.app.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InvalidBookingException extends Exception {
String message;
@Override
public String toString() {
return "InvalidBookingException [message=" + message + "]";
}
}

