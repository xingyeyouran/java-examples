package com.example23.optional;

import java.util.Optional;

public class OptionalTest {

    public static void main(String[] args) {
        // getVersion0(new Computer());
        // getVersion1(new Computer());
        // getEmpty();
        // getOfNullable();
        // getIfPresent();
        // getIfPresentOrElse();
        // getFilter();
        getOr();
        // getOrElse();
        // getGet();
        // getMap();

    }

    // 空指针异常
    public static String getVersion0(Computer com) {
        String version = com.getSoundcard().getUsb().getVersion();
        if (version == null) {
            version = "UNKNOWN";
        }
        return version;
    }

    private static String getVersion1(Computer com) {
        String version = "UNKNOWN";
        if (com != null) {
            Soundcard soundcard = com.getSoundcard();
            if (soundcard != null) {
                USB usb = soundcard.getUsb();
                if (usb != null) {
                    version = usb.getVersion();
                }
            }
        }
        return version;
    }

    private static void getEmpty() {
        Optional<Computer> emp = Optional.empty();
        System.out.println(emp.isPresent());
    }

    private static void getOfNullable() {
        Optional<Computer> op = Optional.ofNullable(null);
        System.out.println(op.isPresent());
        Optional<Computer> op2 = Optional.ofNullable(new Computer());
        System.out.println(op2.isPresent());
    }

    private static void getIfPresent() {
        USB usb = new USB("3.0");
        Optional<USB> usbOP = Optional.ofNullable(usb);
        usbOP.ifPresent(u -> {
            System.out.println(u.getVersion());
        });

        Optional.ofNullable(usb)
                .ifPresent(u -> {
                    System.out.println(u.getVersion());
                });

        Optional.ofNullable(new Computer())
                .ifPresent(c -> {
                    System.out.println(c.getSoundcard().getUsb().getVersion());
                });
    }



    private static void getIfPresentOrElse() {
        USB usb = null;
        //USB usb = new USB("3.0");
        Optional.ofNullable(usb)
                .ifPresentOrElse(u -> {
                    System.out.println(u.getVersion());
                }, () -> {
                    System.out.println("usb为空");
                });
    }

    private static void getFilter() {
        // USB usb = null;
        USB usb = new USB("1.1");
        if (usb != null) {
            if ("3.0".equals(usb.getVersion())) {
                System.out.println(usb.getVersion());
            } else {
                System.out.println("版本不是3.0");
            }
        }

        Optional.ofNullable(usb)
                .filter(u -> "3.0".equals(u.getVersion()))
                .ifPresentOrElse(u -> {
                    System.out.println(u.getVersion());
                }, () -> {
                    System.out.println("版本不是3.0");
                });
    }
    private static void getOr() {
        USB usb = new USB("3.0");
        // USB usb = null;
        Optional.ofNullable(usb)
                .or(() -> {
                    return Optional.of(new USB("1.1"));
                })
                .ifPresent(u -> {
                    System.out.println(u.getVersion());
                });
    }
    private static void getOrElse() {
        // USB usb = new USB("3.0");
        USB usb = null;
        String v1 = Optional.ofNullable(usb)
                .orElseGet(() -> {
                    USB u = new USB("1.1");
                    return u;
                }).getVersion();
        System.out.println(v1);

        String v2 = Optional.ofNullable(usb)
                .orElse(new USB("1.1"))
                .getVersion();
        System.out.println(v2);

    }

    private static void getGet() {
        USB usb = null;
        Optional.ofNullable(usb)
                .or(() -> {
                    System.out.println("怎么会没有呢");
                    return Optional.of(new USB("1.1"));
                })
                .get()
                .getVersion();
    }

    private static void getMap() {
        // Computer com = new Computer(new Soundcard(new USB("3.0")));
        Computer com = new Computer(new Soundcard());
        String version = Optional.ofNullable(com)
                .map(Computer::getSoundcard)
                .map(Soundcard::getUsb)
                .map(USB::getVersion)
                .orElse("UNKNOWN");
        System.out.println(version);
    }

}
